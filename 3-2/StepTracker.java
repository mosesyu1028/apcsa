public class StepTracker
{
	private int dailySteps;
	private int totalSteps;
	private int activeDays;
	private int totalDays;

	//Constructors
	public StepTracker()
	{
			dailySteps = 0;
			totalSteps = 0;
			activeDays = 0;
			totalDays = 0;
	}

	public StepTracker (int daily, int total, int active, int days)
	{
		daily = dailySteps;
		total = totalSteps;
		active = activeDays;
		days = totalDays;
	}

	//Accessors
	public int getActiveDays()
	{
		if (dailySteps >= 10000)
		{
			activeDays += 1;
		}
	}

	public double getAverageSteps()
	{
		if (totalSteps > 0){
			averageSteps = totalSteps % totalDays;
		}
		else {
			averageSteps = 0.0;
		}
	}
	//Mutators
	public void addDailySteps(int steps)
	{
		dailySteps = steps;
		totalSteps += steps;
		totalDays += 1;
	}

	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}
