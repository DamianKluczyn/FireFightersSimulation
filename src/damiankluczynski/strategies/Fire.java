package damiankluczynski.strategies;

import damiankluczynski.units.Unit;
import damiankluczynski.units.Vehicle;
import damiankluczynski.units.IIterator;
import damiankluczynski.states.FreeState;
import static java.lang.Math.random;
import java.util.Vector;

public class Fire extends Strategy {
    public Fire() {
        rideTime = 0;
        fireTime = 0;
        vehicles = new Vector<>();
    }
    @Override
    public void execute(IIterator iIterator) {
        rideTime = (int) (random() * 4);
        while (vehicles.size() < 3) {
            Unit unit = ((Unit) iIterator.next());
            Vector<Vehicle> vehicles = unit.getVehicles();
            int i = 0;
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getState() instanceof FreeState) {
                    System.out.println("Wysylanie wozu nr " + i + " z " + unit.getUnitName() + " na akcje");
                    addObserver(vehicle);
                }
                if (this.vehicles.size() >= 3)
                    break;
                i++;
            }
        }
        if (random() > 0.16) {
            fireTime = 5 + (int)(Math.random() * (25 - 5 + 1));
            System.out.println("\nCzas dotarcia: " + rideTime + " czas trwania pozaru: " + fireTime + "\n");
        }
        else{
            fireTime = 0;
            System.out.println("\nZdarzenie falszywe!");
            System.out.println("Czas dotarcia: " + rideTime + "\n");
        }

        notifyAllObservers();
    }
}
