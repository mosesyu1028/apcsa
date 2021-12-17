public class Dancer
{
    public void act()
    {
        System.out.print (" spin ");
        doTrick();
    }

    public void doTrick()
    {
        System.out.print (" float ");
    }
}

public class Acrobat extends Dancer
{
    public void act()
    {
        super.act();
        System.out.print (" flip ");
    }

    public void doTrick()
    {
        System.out.print (" somersault ");
    }
}

public class main {
    public static void main(String args[]) {
        Dancer a = new Acrobat();
        a.act(); // spin somersault flip
    }
}
