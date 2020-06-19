import java.util.Random; 
import java.io.*;
import java.util.*;

interface EmpWageBuilder
{
abstract void getDetails();
abstract void showDetails();
abstract void computeWage();
}

abstract class CompanyWage implements EmpWageBuilder
{
static String companyName[]=new String[10];
static int wage[]=new int[10];
static int wageHourPart=15;
static int wageHourFull=20;
static int dayHour=8;
static int dailyWageFull=0;
static int dailyWagePart=0;
static int daysPerMonth=20;
static int monthlyWageFull=0;
static int monthlyWagePart=0;
static int present=0,absent=0,days=0,workedHours=0;
public static int count,i,j,num=1;

public void getDetails()
{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of companies : ");
		count=s.nextInt();
for(i=0;i<count;i++)
{
		System.out.println("\n--------------------------------------------");
		System.out.println("Enter the name of company : " + num);
		companyName[i]=s.next(); 
		num++;
		computeWage();
}
}

public void showDetails()
{
for(i=0;i<count;i++)
{
System.out.println("Wage of "+companyName[i]+" Employee : "+wage[i]);
}
}

public void computeWage()
{

	   		System.out.println("Calculating Wage of Company : " + companyName[i] );
		        Random rand = new Random();
                	int random = rand.nextInt(100);
                	random=random%2;
switch(random)
{
case 1:
			System.out.println("FULL TIME");
                	dailyWageFull=wageHourFull*dayHour;
        for(int i=1;workedHours<96 && present<20 && days<31;i++){
                	random = rand.nextInt(100);
                	random=random%2;
   	if(random==0)
      		{
                	monthlyWageFull+=dailyWageFull;
                	present++;
                	days++;
                	workedHours+=5;
            }
   	else
      		{
               	 days++;
            }
                }
			System.out.println("DONE");
			wage[i]=monthlyWageFull;
			present=absent=days=workedHours=monthlyWagePart=0;
break;

case 0:
		System.out.println("PART TIME");
          	dailyWagePart=wageHourPart*dayHour;
   for(int i=1;workedHours<100 && present<20 && days<31;i++)
	{
      		random = rand.nextInt(100);
          	random=random%2;
   	if(random==0)
      		{
      		monthlyWagePart+=dailyWagePart;
      		present++;days++;workedHours+=5;
      		}
   	else
      		{
          	days++;
      		}
      }
			System.out.println("DONE");
			wage[i]=monthlyWagePart;
			present=absent=days=workedHours=monthlyWagePart=0;
break;

default:
          	System.out.println("Invalid");
break;
}
}
public void calculate()
{
getDetails();
showDetails();
}

}

public class CompanyWageInterface extends CompanyWage
{
public static void main(String[] args)
{
		System.out.println("---------------------------------------------------------");
		System.out.println(".... Welcome to Employee Wage Computation Portal ....");
		System.out.println("---------------------------------------------------------");
		CompanyWageInterface id= new CompanyWageInterface();
		id.calculate();
}
}
