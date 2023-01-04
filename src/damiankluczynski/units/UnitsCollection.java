package damiankluczynski.units;

import java.util.Collections;
import java.util.Vector;

public class UnitsCollection implements ICollection {
    private Vector<Unit> units;

    public void add(Unit unit){
        units.add(unit);
    }

    public int size(){
        return units.size();
    }

    public UnitsCollection(){
        units = new Vector<>();
    }

    public IIterator createIterator() {
        return new UnitsIterator(this);
    }

    public Unit getUnit(int index){
        return units.get(index);
    }

    public void sort(double[] coordinates){
        Collections.sort(units, new UnitsComparator(coordinates));
    }
}
