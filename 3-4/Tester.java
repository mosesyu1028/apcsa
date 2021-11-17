public class Tester
{
    public void someMethod(int a, int b) // 6, 8
    {
        int temp = a; // temp = 6
        a = b; // a = 8
        b = temp; // b = 6
    }
}

public class TesterMain
{
    public static void main(String[] args)
    {
        int x = 6, y = 8;
        Tester tester = new Tester();
        tester.someMethod(x, y);
    }
}
