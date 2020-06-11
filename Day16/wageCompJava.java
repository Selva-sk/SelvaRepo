import java.util.Random;

public class wageCompJava{
static int wageHourPart=15;
static int wageHourFull=20;
static int dayHour=8;
static int dailyWageFull=0;
static int dailyWagePart=0;

	public static void main(String[] args)
	{
		Random rand = new Random();
		int random = rand.nextInt(100);

if(random>=70)
	{
		random = rand.nextInt(100);
	if(random>=70)
		{
      System.out.println("Full Time Employee is Present");
      dailyWageFull=wageHourFull*dayHour;
      System.out.println("Employee wage(Per Day):" + dailyWageFull);
      }
   else
      {
      System.out.println("Full Time Employee is Absent");
      System.out.println("Employee wage(Per Day):" + dailyWageFull);
      }
	}
else
	{
		random = rand.nextInt(100);
	if(random<70)
		{
		System.out.println("Part Time Employee is Present");
		dailyWagePart=wageHourPart*dayHour;
		System.out.println("Employee wage(Per Day):" + dailyWagePart);
		}
	else
		{
		System.out.println("Full Time Employee is Absent");
		System.out.println("Employee wage(Per Day):" + dailyWagePart);
		}
	}
	}
}
