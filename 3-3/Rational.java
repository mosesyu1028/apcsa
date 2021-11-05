
public class Rational
{
    private int numerator;
    private int denominator;
 
    /** default constructor */
    Rational()
    { /* implementation not shown */ }
 
    /** Constructs a Rational with numerator n and
     * denominator 1. */
    Rational(int n)
    { /* implementation not shown */ }
 
    /** Constructs a Rational with specified numerator and
     * denominator. */
    Rational(int numer, int denom)
    { /* implementation not shown */ }
 
    /** Returns numerator. */
    int numerator()
    { /* implementation not shown */ }
    
    /** Returns denominator. */
    int denominator()
    { /* implementation not shown */ }

    /** Returns (this + r). Leaves this unchanged.
     */
    public Rational plus(Rational r)
    { /* implementation not shown */ }

    //Similarly for times, minus, divide
        ...
    /** Ensures denominator > 0. */
    private void fixSigns()
    { /* implementation not shown */ }

    /** Ensures lowest terms. */
    private void reduce()
    { /* implementation not shown */ }
}