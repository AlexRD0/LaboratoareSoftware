package lab5.advanced;

import lab5.IntCalculator;

public class DoubleCalculator extends ACalculator{
    DoubleCalculator(double s){
        state = s;
    }
    @Override
    ACalculator init() {
        state = 0;
        return this;
    }
    DoubleCalculator add(double x){
        state = (Double)state+x;
        return this;
    }
    DoubleCalculator subtract(double x) {
        return add(-x);
    }
    DoubleCalculator multiply(double x){
        state = (Double)state*x;
        return this;
    }

}
