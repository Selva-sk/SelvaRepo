import java.util.Random;

public class wageCompJava{
static int wagePerHour=20;
static int fullDayHour=8;
static int dailyWageFull=0;
	public static void main(String[] args)
	{
		Random rand = new Random();
		int random = rand.nextInt(100);

		System.out.println("Checking Employee Attendance...");

	if(random>50)
		{
		System.out.println("Employee is Present");
		dailyWageFull=wagePerHour*fullDayHour;
		System.out.println("Full Time Employee wage(Per Day):" + dailyWageFull);
		}
	else
		{
		System.out.println("Employee is Absent");
		System.out.println("Full Time Employee wage(Per Day):" + dailyWageFull);
		}
	}
}
