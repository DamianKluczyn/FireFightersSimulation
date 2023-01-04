package damiankluczynski.units;

import java.util.Vector;
import static java.lang.Math.sqrt;

public class Unit {
    private String unitName;
    private double[] coordinates;
    private Vector<Vehicle> vehicles;

    public Unit(String unitName, double[] coordinates) {
        this.unitName = unitName;
        this.coordinates = coordinates;
        this.vehicles = new Vector<>();
        for (int i = 0; i < 5; i++) {
            this.vehicles.add(new Vehicle());
        }
    }

    public void step() {
        System.out.println("Zajete wozy strazy pozarnej " + unitName + ": ");
        int i = 0;
        for (Vehicle vehicle : vehicles) {
            vehicle.makeStep(i);
            i++;
        }
    }

    public Vector<Vehicle> getVehicles() {
        return this.vehicles;
    }

    public String getUnitName() {
        return unitName;
    }
    public Double getDistance(double[] incidentCoordinates) {
        double x = incidentCoordinates[0] - coordinates[0];
        double y = incidentCoordinates[1] - coordinates[1];
        return sqrt(x * x + y * y);
    }


}
