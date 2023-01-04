package damiankluczynski.units;

import damiankluczynski.strategies.Strategy;
import java.util.Vector;

public class AllUnits {
    private Strategy strategy;
    private UnitsCollection unitsCollection;
    private Vector<Unit> unitVector;


    public AllUnits() {
        unitVector = new Vector<>();
        unitsCollection = new UnitsCollection();
        addUnit("JRG-1", new double[]{50.05999546754905, 19.94311273940794});
        addUnit("JRG-2", new double[]{50.0334788502075, 19.9359033914334});
        addUnit("JRG-3", new double[]{50.075782424336374, 19.887523751004867});
        addUnit("JRG-4", new double[]{50.037798842647675, 20.00614171409626});
        addUnit("JRG-5", new double[]{50.09173580126222, 19.920381753047778});
        addUnit("JRG-6", new double[]{50.016213431628586, 20.01607871649386});
        addUnit("JRG-7", new double[]{50.09408065317086, 19.977735182621227});
        addUnit("JRG Szkoly Aspirantow PSP", new double[]{50.077461950994866, 20.033159628860805});
        addUnit("JRG Skawina", new double[]{49.968484671124315, 19.799516377610022});
        addUnit("LSP Lotniska w Balicach", new double[]{50.07365368416614, 19.785828235745207});
    }

    public void addUnit(String name, double[] coords) {
        Unit unit = new Unit(name, coords);
        unitsCollection.add(unit);
        unitVector.add(unit);
    }

    public void start(double[] coordinates) {
        unitsCollection.sort(coordinates);
        this.strategy.execute(unitsCollection.createIterator());
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void step() {
        for (Unit unit : unitVector) {
            unit.step();
        }
    }
}
