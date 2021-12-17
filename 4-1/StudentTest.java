public class StudentTest
{
    public static void computeAllGrades(Student[] studentList)
    {
        // for each element "s" inside of "studentList"
        for (Student s : studentList) // [brian, tim, kevin, null, null] -> s = brian, tim, kevin, null, null
            if (s != null)
                s.computeGrade();
    }

    public static void main(String[] args)
    {
        Student[] stu = new Student[5];
        stu[0] = new Student("Brian Lorenzen", new int[] {90,94,99}, "none");
        stu[1] = new UnderGrad("Tim Broder", new int[] {90,90,100}, "none");
        stu[2] = new GradStudent("Kevin Cristella", new int[] {85,70,90}, "none", 1234);
        // stu[3] = null;
        // stu[4] = null;

        computeAllGrades(stu);


    }
}
