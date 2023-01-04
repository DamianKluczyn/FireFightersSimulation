package damiankluczynski.strategies;

import damiankluczynski.units.IIterator;
import damiankluczynski.units.Unit;
import damiankluczynski.units.Vehicle;
import java.util.Vector;

public abstract class Strategy {

    protected Unit unit;
    protected Vector<Vehicle> vehicles;
    protected int rideTime;
    protected int fireTime;
    public abstract void execute(IIterator iIterator);

    protected void notifyObserver(Vehicle vehicle){
        vehicle.update(this);
    }
    protected void notifyAllObservers(){
        for (Vehicle vehicle: vehicles) {
            notifyObserver(vehicle);
        }
    }

    public int getFireTime() {
        return fireTime;
    }

    public int getRideTime() {
        return rideTime;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    protected void addObserver(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    protected void removeObserver(Vehicle vehicle){
        vehicles.remove(vehicle);
    }

}
