public class Time
{
    private int hrs;
    private int mins;
    private int secs;

    public Time()
    { /* implementation not shown */ }

    public Time(int h, int m, int s)
    { /* implementation not shown */ }

    /** Resets time to hrs = h, mins = m, secs = s. */
    public void resetTime(int h, int m, int s)
    { /* implementation not shown */ }

    /** Advances time by one second. */
    public void increment()
    { /* implementation not shown */ }

    /** Returns true if this time equals t, false otherwise. */
    public boolean equals(Time t)
    { /* implementation not shown */ }

    /** Returns true if this time is earlier than t, false otherwise. */
    public boolean lessThan(Time t)
    { /* implementation not shown */ }

    /** Returns a String with the time in the form hrs:mins:secs. */
    public String toString()
    { /* implementation not shown */ }

    /** Outputs time t in the form hrs:mins:secs. */
    public void display (Time t)
    {
        /* method body */
    }


}

//main.java
/*
GOAL" replace "method body"

I
Time T = new Time(h, m, s);
System.out.println(T);

II
System.out.println(t.hrs + ":" + t.mins + ":" + t.secs);

III
System.out.println(t); -> System.out.println(t.toString())


Time t1 = new Time();
Time t2 = new Time(15, 14, 13);

COMPARE t1 TO t2


boolean time = t1.equals(t2);

t1.equals(t2)
*/
