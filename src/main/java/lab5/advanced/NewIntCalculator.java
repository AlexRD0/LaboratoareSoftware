package lab5.advanced;

import lab5.IntCalculator;

public class NewIntCalculator extends ACalculator{
    NewIntCalculator(int s){
        state = s;
    }
    @Override
    ACalculator init() {
        state = 0;
        return this;
    }
    NewIntCalculator add(int x){
        state = (Integer)state+x;
        return this;
    }
    NewIntCalculator subtract(int x) {
        return add(-x);
    }
    NewIntCalculator multiply(int x){
        state = (Integer)state*x;
        return this;
    }
}
