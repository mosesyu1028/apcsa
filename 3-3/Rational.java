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
    (A) methods whose return type is void cannot be public.
    (B) methods that change this cannot be public.
    (C) the reduce() method is not intended for use by objects outside the Rational class.
    (D) the reduce() method is intended for use only by objects outside the Rational class.
    (E) the reduce() method uses only the private data fields of the Rational class.
 */

/*
The constructors in the Rational class allow initialization of Rational objects in several different ways. Which of the following will cause an error?
    (A) Rational r1 = new Rational();
    (B) Rational r2 = r1;
    (C) Rational r3 = new Rational(2,-3);
    (D) Rational r4 = new Rational(3.5);
    (E) Rational r5 = new Rational(10);

*/


// Here is the implementation code for the plus method:

/** Returns (this + r). Leaves this unchanged. */
public Rational plus(Rational r)
{
    fixSigns();
    r.fixSigns();
    int denom = denominator * r.denominator;
    int numer = numerator * r.denominator
                + r.numerator * denominator;
    /* more code */
}

// Which of the following is a correct replacement for /* more code */?
/*

(A)
Rational rat(numer, denom);
rat.reduce();
return rat;

(B)
return new Rational(numer, denom);

(C)
reduce();
Rational rat = new Rational(numer, denom);
return rat;

(D)
Rational rat = new Rational(numer, denom);
Rational.reduce();
return rat;

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
    (A) r = a.plus(r);
    (B) a = r.plus(new Rational(n));
    (C) r = r.plus(r);
    (D) a = n.plus(r);
    (E) r = r.plus(new Rational(n));

*/