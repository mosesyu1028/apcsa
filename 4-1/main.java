public class main {
    public static void main(String args[]) {

        Student s = new Student();
        Student g = new GradStudent();
        Student u = new UnderGrad();

        Student s = new Student("Brian Lorenzen", new int[] {90,94,99}, "none");
        Student u = new UnderGrad("Tim Broder", new int[] {90,90,100}, "none");
        Student g = new GradStudent("Kevin Cristella", new int[] {85,70,90}, "none", 1234);

        s.setGrade("Pass");
        u.setGrade("Pass");
        g.setGrade("Pass");

        int sID = s.getID();
        int uID = u.getID();
        int gID = g.getID();

        s.computeGrade();
        u.computeGrade();
        g.computeGrade();

        // main part 2 electric boogaloo
        Student s = null;
        Student u = new UnderGrad("Tim Broder", new int[] {90,90,100}, "none");
        Student g = new GradStudent("Kevin Cristella", new int[] {85,70,90}, "none", 1234);
        System.out.print("Enter Student status: ");
        System.out.println("Grad (G), UnderGrad (U), Neither (N)");
        String str = ...;          //read user input
        if (str.equals("G"))
            s = g;
        else if (str.equals("U"))
            s = u;
        else
            s = new Student();
        s.computeGrade();


        Student s = new GradStudent();
        GradStudent g = new GradStudent();

        int x = s.getID(); // error
        int x = ((GradStudent) s).getID();
        int y = g.getID();

    }
}
