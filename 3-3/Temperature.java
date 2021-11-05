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

