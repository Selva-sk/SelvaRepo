import java.util.Random;

public class wageCompJava{
static int wageHourPart=15;
static int wageHourFull=20;
static int dayHour=8;
static int dailyWageFull=0;
static int dailyWagePart=0;
static int daysPerMonth=20;
static int monthlyWageFull=0;
static int monthlyWagePart=0;
static int present,absent=0;

public static void main(String[] args)
	{
		Random rand = new Random();
		int random = rand.nextInt(100);
		random=random%2;

switch(random)
{
case 1:
		dailyWageFull=wageHourFull*dayHour;
		System.out.println("Full Time Employee wage(Per Day):" + dailyWageFull);
	for(int i=1;i<=20;i++){ 
		random = rand.nextInt(100);
   if(random>=50)
      {
      System.out.println("Day"+ i +": Present");
		monthlyWageFull+=dailyWageFull;
		present++;
		}
   else
      {
      System.out.println("Day"+ i +": Absent");
      }
		}
		System.out.println("No of Days worked:" + present);
      System.out.println("Employee wage(Per Month):" + monthlyWageFull);

break;

case 0:
 		dailyWagePart=wageHourPart*dayHour;
      System.out.println("Part Time Employee wage(Per Day):" + dailyWagePart);
   for(int i=1;i<=20;i++){
      random = rand.nextInt(100);
   if(random>=50)
      {
      System.out.println("Day"+ i +": Present");
      monthlyWagePart+=dailyWagePart;
      present++;
      }
   else
      {
      System.out.println("Day"+ i +": Absent");
      }
      }
      System.out.println("No of Days worked:" + present);
      System.out.println("Employee wage(Per Month):" + monthlyWagePart);
break;

default:
		System.out.println("Invalid");
break;
}
	}
}
