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
    //...

    /** Ensures denominator > 0. */
    private void fixSigns()
    { /* implementation not shown */ }

    /** Ensures lowest terms. */
    private void reduce()
    { /* implementation not shown */ }
}

/*
The method reduce() is not a public method because
    (C) the reduce() method is not intended for use by objects outside the Rational class.

The constructors in the Rational class allow initialization of Rational objects in several different ways. Which of the following will cause an error?
    (D) Rational r4 = new Rational(3.5);

*/


// Here is the implementation code for the plus method:

/** Returns (this + r). Leaves this unchanged. */
// public Rational plus(Rational r)
// {
//     fixSigns();
//     r.fixSigns();
//     int denom = denominator * r.denominator;
//     int numer = numerator * r.denominator
//                 + r.numerator * denominator;
//     /* more code */
//
//     //denom, numer -> Rational
//     Rational rat = new Rational(numer, denom);
//     //reduce: 9/6 -> 3/2
//     rat.reduce();
//     //return
//     return rat;
//
// }
// Which of the following is a correct replacement for /* more code */?
/*
(E)
Rational rat = new Rational(numer, denom);
rat.reduce();
return rat;
*/

/*
Assume these declarations:

Rational a = new Rational();
Rational r = new Rational(numer, denom);
int n = value;
//numer, denom, and value are valid integer values

Which of the following will cause a compile-time error?
    (D) a = n.plus(r);
*/
