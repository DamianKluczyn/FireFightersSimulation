package damiankluczynski.states;

import damiankluczynski.units.Vehicle;

public class BusyState implements IState {
    private Vehicle vehicle;

    public BusyState(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public IState nextState() {
        return new FreeState(this.vehicle);
    }
}
