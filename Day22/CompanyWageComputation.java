import java.util.Random; //importing package
import java.io.*;
import java.util.*;


public class CompanyWageComputation{ //main class WageCalculation
static int wageHourPart=15;
static int wageHourFull=20;
static int dayHour=8;
static int dailyWageFull=0;
static int dailyWagePart=0;
static int daysPerMonth=20;
static int monthlyWageFull=0;
static int monthlyWagePart=0;
static int present=0,absent=0,days=0,workedHours=0;
public static int count,i,num=1,empCount=0;
public static String company;

public static void computeWage(int num,int wageHourPart,int wageHourFull,String company) //class method 
{

		System.out.println("\n" + "Calculating Wage for Employee " + num + " of Company : " + company + "\n");
		Random rand = new Random();
                int random = rand.nextInt(100);
                random=random%2;

switch(random)
{
case 1:  	//Full Time Employee Wage calculation
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
                System.out.println("No of Days worked:" + present);
                System.out.println("No of Hours worked:"+ workedHours);
      		System.out.println("Employee wage(Per Month):" + monthlyWageFull);
		present=absent=days=workedHours=0;


break;

case 0:  	//Part time employee wage calculation
          	dailyWagePart=wageHourPart*dayHour;
      		System.out.println("Part Time Employee wage(Per Day):" + dailyWagePart);
   for(int i=1;workedHours<100 && present<20 && days<31;i++)
	{
      		random = rand.nextInt(100);
          	random=random%2;
   	if(random==0)
      		{
      		//System.out.println("Day"+ i +": Present");
      		monthlyWagePart+=dailyWagePart;
      		present++;days++;workedHours+=5;
      		}
   	else
      		{
      		//System.out.println("Day"+ i +": Absent");
          	days++;
      		}
      }
      		System.out.println("No of Days worked:" + present);
          	System.out.println("No of Hours worked:"+ workedHours);
      		System.out.println("Employee wage(Per Month):" + monthlyWagePart);
		present=absent=days=workedHours=0;
break;

default:
          	System.out.println("Invalid");
break;
}


}

public static void main(String[] args)
{
		System.out.println(".... Welcome to Employee Wage Computation Portal ....");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of companies : ");
		count=s.nextInt();
		CompanyWageComputation id[] = new CompanyWageComputation[count];  //Creating array of Objects with count n
   for(int i=0,z=1;i<count;i++,z++)
	{
		System.out.println("\n" + "Enter the name of the company : " + z);
		company=s.next();
		System.out.println("\n" + "Enter no of Employee you want to calculate wage : ");
		empCount=s.nextInt();
	for(int j=0;j<empCount;j++)
		{	
			Random rand = new Random();
			int random = rand.nextInt(100);
                	random=random%2;
		        if(random==0)
                	{
				id[i].computeWage(num,20,25,company);//calling class method using 3rd object
				num++;
			}
			else
			{
				id[i].computeWage(num,15,20,company);
				num++;
			}
		}
				num=1;
	}
}
}
