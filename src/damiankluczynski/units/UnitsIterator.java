package damiankluczynski.units;

public class UnitsIterator implements IIterator {

    private UnitsCollection collection;
    private int currentPosition;

    public UnitsIterator(UnitsCollection collection) {
        this.collection = collection;
        currentPosition = -1;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < collection.size() - 1;
    }

    @Override
    public Object next() {
        if (hasNext())
            currentPosition++;
        return collection.getUnit(currentPosition);
    }
}
