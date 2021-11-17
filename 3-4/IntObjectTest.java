public class IntObjectTest
{
    public static IntObject someMethod(IntObject obj)
    {
        IntObject ans = obj;
        ans.increment();
        return ans;
    }
    public static void main(String[] args)
    {
        IntObject x = new IntObject(2); // x is an IntObject with num = 2
        IntObject y = new IntObject(7); // y is also, with num = 7
        IntObject a = y; // a is another pointer to the IntObject y
        x = someMethod(y); // x = someMethod(IntObject y)
        a = someMethod(x);

        String str;

        String newStr = str;

        // What are the object values of x, y, and a?

    }
}
