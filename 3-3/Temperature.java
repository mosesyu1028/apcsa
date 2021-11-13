public class Temperature
{
    private String scale; //valid values are "F" or "C"
    private double degrees;

    /** constructor with specified degrees and scale */
    public Temperature(double tempDegrees, String tempScale)
    { /* implementation not shown */ }

    /** Mutator. Converts this Temperature to degrees Fahrenheit.
     * Returns this temperature in degree Fahrenheit.
     * Precondition:     Temperature is a valid temperature
     *                   in degrees Celsius.
     */
    public Temperature toFahrenheit()
    { /* implementation not shown */ }

    /** Mutator. Converts this Temperature to degrees Celsius.
     * Returns this temperature in degrees Fahrenheit.
     * Precondition:     Temperature is a valid temperature
     *                   in degrees Celsius.
     */
    public Temperature toCelsius()
    { /* implementation not shown */ }

    /** Mutator.
     * Returns this temperature raised by amt degrees.
    */
    public Temperature raise(double amt)
    { /* implementation not shown */ }

    /** Returns true if tempDegrees is a valid temperature
     * in the given temperature scale, false otherwise.
    */
    public static boolean isValidTemp(double tempDegrees, String tempScale)
    { /* implementation not shown */ }
    //Other methods are not shown.

    public static void main(String[] args) {

    }
}

/*
A client method contains this code segment:


Temperature t1 = new Temperature(40, "C");
Temperature t2 = t1;
Temperature t3 = t2.lower(20);
Temperature t4 = t1.toFahrenheit();

Which statement is true following execution of this segment?
(B) t1, t2, t3, and t4 all represent the identical temperature, in degrees Fahrenheit.
*/
