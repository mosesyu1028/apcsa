public class StepTracker
{
    private int totalSteps;
    private int activeDays;
    private int totalDays;

    private int stepsReq;

//Constructors
    public StepTracker(int req)
    {
        totalSteps = 0;
        activeDays = 0;
        totalDays = 0;

        stepsReq = req;
    }

    // public StepTracker (int daily, int total, int active, int days)
    // {
    //     daily = dailySteps;
    //     total = totalSteps;
    //     active = activeDays
    //     days = totalDays;
    // }

    //Accessors
    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        if (totalDays > 0) {
            return totalSteps / (double) totalDays;
        }
        else {
            return 0.0;
        }
    }

    //Mutators
    public void addDailySteps(int steps)
    {
        totalSteps += steps;
        totalDays++;

        if (steps >= stepsReq) {
            activeDays++;
        }
    }

    // main
    public static void main(String args[]) {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());

    }
}
