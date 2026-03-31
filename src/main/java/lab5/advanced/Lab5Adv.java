package lab5.advanced;

import lab5.AdvancedCalculator;
import lab5.IntCalculator;

public class Lab5Adv {
    static void main(String[] args) {
    NewIntCalculator calculator = new NewIntCalculator(10);
    int result = (Integer)calculator.add(5).subtract(3).multiply(2).result();
    System.out.println("a) " + result);

    DoubleCalculator dCalculator = new DoubleCalculator(10);
    double result2 = (Double)dCalculator.add(5).subtract(3.3).multiply(2.2).result();
    System.out.println("b) " + result2);
    }
}
