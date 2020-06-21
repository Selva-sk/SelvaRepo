import java.util.Random; //importing package
import java.io.*;
import java.util.*;

public class WageCalculation{ //main class WageCalculation
static int wageHourPart=15;
static int wageHourFull=20;
static int dayHour=8;
static int dailyWageFull=0;
static int dailyWagePart=0;
static int daysPerMonth=20;
static int monthlyWageFull=0;
static int monthlyWagePart=0;
static int present,absent=0;
static int workedHours=0,days=0;
public static int count,i,num=1;

public static void computeWage(int number) //class method 
{

		System.out.println("\n" + "Calculating Wage for Employee : " + num + "\n");
		num++;

		Random rand = new Random();
                int random = rand.nextInt(100);
                random=random%2;

switch(random)
{
case 1:  //Full Time Employee Wage calculation
                dailyWageFull=wageHourFull*dayHour;
                System.out.println("Full Time Employee wage(Per Day):" + dailyWageFull);
        for(int i=1;workedHours<96 && present<20 && days<31;i++){
                random = rand.nextInt(100);
                random=random%2;
   if(random==0)
      {
      //System.out.println("Day"+ i +": Present");
                monthlyWageFull+=dailyWageFull;
                present++;
                days++;
                workedHours+=5;
                }
   else
      {
      //System.out.println("Day"+ i +": Absent");
                days++;
                }
                }
                System.out.println("...Limit Reached...");
                System.out.println("No of Days worked:" + present);
                System.out.println("No of Hours worked:"+ workedHours);
      System.out.println("Employee wage(Per Month):" + monthlyWageFull);

break;

case 0:  //Part time employee wage calculation
          dailyWagePart=wageHourPart*dayHour;
      System.out.println("Part Time Employee wage(Per Day):" + dailyWagePart);
   for(int i=1;workedHours<100 && present<20 && days<31;i++){
      random = rand.nextInt(100);
          random=random%2;
   if(random==0)
      {
      //System.out.println("Day"+ i +": Present");
      monthlyWagePart+=dailyWagePart;
      present++;
          days++;
          workedHours+=5;
      }
   else
      {
      //System.out.println("Day"+ i +": Absent");
          days++;
      }
      }
          System.out.println("...Limit Reached...");
      System.out.println("No of Days worked:" + present);
          System.out.println("No of Hours worked:"+ workedHours);
      System.out.println("Employee wage(Per Month):" + monthlyWagePart);
break;

default:
          System.out.println("Invalid");
break;
}


}

public static void main(String[] args)
	{
		System.out.println(".... Welcome to Employee Wage Computation Portal ....");
		System.out.println("Enter no.of Employee to calculate wage : ");
		Scanner s=new Scanner(System.in);
		count=s.nextInt();
		WageCalculation id[] = new WageCalculation[count];  //Creating array of Objects with count n
for(i=0;i<count;i++)
	{
		id[i].computeWage(count);//calling class method using 3rd object
	}
	}
}
