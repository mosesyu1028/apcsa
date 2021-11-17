public class CountStuff
{
    public static void doSomething()
    {
        int count = 0;
            ...
        //code to do something - no screen output produced count++;
        count = 100;
    }

    public static void main(String[] args)
    {
        int count = 0;
        System.out.println("How many iterations?");
        int n = ...; //read user input (3)

        // for (int i = 1; i <= n; i++)
        for (int i = 0; i < n; i++)
        {
            doSomething();
            System.out.println(count);
            //OUTPUT:
            //0
            //0
            //0
        }
    }
}
