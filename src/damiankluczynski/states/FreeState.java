package damiankluczynski.states;

import damiankluczynski.units.Vehicle;

public class FreeState implements IState {

    private Vehicle vehicle;

    public FreeState(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public IState nextState() {
        return new BusyState(this.vehicle);
    }
}
