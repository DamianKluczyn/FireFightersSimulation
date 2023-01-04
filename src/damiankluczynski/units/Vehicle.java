package damiankluczynski.units;

import damiankluczynski.states.FreeState;
import damiankluczynski.states.IState;
import damiankluczynski.strategies.Strategy;

public class Vehicle {
    private IState state;
    private int actionTime;

    public Vehicle() {
        this.state = new FreeState(this);
        this.actionTime = 0;
    }

    public void changeState(){
        this.state = this.state.nextState();
    }

    public void update(Strategy strategy){
        changeState();
        actionTime = strategy.getFireTime()+2*strategy.getRideTime();
    }

    public void makeStep(int index){
        if(actionTime !=0){
            System.out.println(index+": "+ actionTime);
            actionTime--;
            if(actionTime ==0){
                this.changeState();
            }
        }
    }

    public IState getState(){
        return this.state;
    }

}
