// Can use import static java.lang.Math.*; to not require Math. prefix

public class MathFunctions {

    // Absolute value
    int absInt = Math.abs(-2); // 2
    double absDouble = Math.abs(-3.5); // 3.5

    // Power
    double power = Math.pow(4, 1.5) // 4^(3/2) = 8

    // Square root
    double sqrt = Math.sqrt(10) // 10^(1/2) = 3.16227766017

    double cbrt = Math.pow(27, 1.0/3) // 3

    // A = pi * r^2
    // r = sqrt(A/pi)
    double area = 20.5;
    double radius = Math.sqrt(area/Math.PI);


    // Random
    double lottery = Math.random() // 0.0 <= lottery < 1.0


    // an integer between 0 and 10, inclusive
    int zeroToTen = Math.random() * 11
    // an integer between 100 and 200, inclusive
    int randomHundred = (Math.random() * 101) + 100

    // General formulas for lazy people:
    // Random real value x | lowValue <= x < highValue
    double x = (highValue - lowValue) * Math.random() + lowValue;

    // Random integer num | lowValue <= num < highValue
    int num = (Math.random() * (highValue - lowValue + 1)) + lowValue;

}
