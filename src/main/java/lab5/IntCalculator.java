package lab5;

public class IntCalculator {
    protected int state;
    IntCalculator(int s){
        state = s;
    }
    IntCalculator add(int x){
        state = state+x;
        return this;
    }
    IntCalculator subtract(int x) {
        return add(-x);
    }
    IntCalculator multiply(int x){
        state = state*x;
        return this;
    }
    int result(){
        return state;
    }
    IntCalculator clear(){
        state = 0;
        return this;
    }
}
