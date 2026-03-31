package lab5.advanced;

public abstract class ACalculator {
    protected Object state;
    Object result(){
        return state;
    }
    ACalculator clear(){
        state = 0;
        return this;
    }
    abstract ACalculator init();
}
