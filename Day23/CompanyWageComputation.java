import java.util.Random; 
import java.io.*;
import java.util.*;

class EmpWageBuilder
{
static String companyName[]=new String[10];
static int empCount[]=new int[10];
static int wage[][]=new int[3][3];
static int wageHourPart=15;
static int wageHourFull=20;
static int dayHour=8;
static int dailyWageFull=0;
static int dailyWagePart=0;
static int daysPerMonth=20;
static int monthlyWageFull=0;
static int monthlyWagePart=0;
static int present=0,absent=0,days=0,workedHours=0;
public static int count,i,j=1,num=1,a=0,b=0,c=0,d=0,x=0,y=0;

public static void getDetails()
{

Scanner s=new Scanner(System.in);
for(int i=0,z=1;i<count;i++,z++)
	{
		System.out.println("\n" + "Enter the name of the company : " + z);
		companyName[c]=s.next();
		System.out.println("\n" + "Enter no of Employee you want to calculate wage : <=3");
		empCount[c]=s.nextInt();
	for(j=1;j<=empCount[c];j++)
		{
				computeWage();
		}
				c++;a++;b=0;
	}
}

public static void showDetails()
{
for(x=0;x<count;x++)
{
for(y=0;y<empCount[x];y++)
{
System.out.println(wage[x][y]);
}
}
}

public static void computeWage() 
{

	   		    	System.out.println("\n" + "Calculating Wage for Employee " + j + " of Company : " + companyName[c] + "\n");
		          	Random rand = new Random();
                	int random = rand.nextInt(100);
                	random=random%2;
switch(random)
{
case 1:
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
						System.out.println("....Done....");
						wage[a][b]=monthlyWageFull;
						System.out.println(wage[a][b]);
						b++;
break;

case 0:
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
				System.out.println("....Done....");
				wage[a][b]=monthlyWagePart;
				System.out.println(wage[a][b]);
  				b++;
				present=absent=days=workedHours=monthlyWagePart=0;
break;

default:
          	System.out.println("Invalid");
break;
}
}}
public class CompanyWageComputation extends EmpWageBuilder
{

public static void main(String[] args)
{
		Scanner s=new Scanner(System.in);
		System.out.println(".... Welcome to Employee Wage Computation Portal ....");
		System.out.println("Enter no.of companies : <=3");
		count=s.nextInt();
		EmpWageBuilder id[] = new EmpWageBuilder[count];
		id[0].getDetails();
      id[0].showDetails();
}
}
