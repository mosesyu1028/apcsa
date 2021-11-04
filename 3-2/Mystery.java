public class Mystery
{
    public static void strangeMethod(int x, int y) //x = 6, y = 3
    {
        x += y; // x = 9
        y *= x; // y = 27
        System.out.println(x + " " + y);
    }

    public static void main(String[] args)
    {
        int a = 6, b = 3;
        strangeMethod(a, b);
        System.out.println(a + " " + b);
    }




OUTPUT:
9 27
6 3
