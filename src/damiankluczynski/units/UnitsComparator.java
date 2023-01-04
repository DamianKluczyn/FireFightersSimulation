package damiankluczynski.units;

import java.util.Comparator;

public class UnitsComparator implements Comparator<Unit> {
    private double[] coordinates;

    public UnitsComparator(double[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public int compare(Unit unit1, Unit unit2) {
        if (unit1.getDistance(coordinates) < unit2.getDistance(coordinates))
            return -1;
        else if (unit1.getDistance(coordinates) > unit2.getDistance(coordinates)) {
            return 1;
        }
        return 0;
    }
}
