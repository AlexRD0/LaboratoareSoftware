package lab5;

import static java.lang.Math.pow;

public class AdvancedCalculator extends IntCalculator {
    AdvancedCalculator(int value){
        //state = value;
        super(value);
    }
    AdvancedCalculator divide(int x){
        if(x!=0) {
            state = state / x;
        }
        return this;
    }
    AdvancedCalculator power(int x){
        state = (int)pow(state, x);
        return this;
    }
    AdvancedCalculator root(int x){
        state = (int)Math.pow(state, (1.0/x));
        return this;
    }
}
