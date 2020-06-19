import java.util.Random;
import java.io.*;
import java.util.*;


class EmpWageBuilder
{
static int wageHourPart=15;
static int wageHourFull=20;
static int dayHour=8;
static int dailyWageFull=0;
static int dailyWagePart=0;
static int daysPerMonth=20;
static int monthlyWageFull=0;
static int monthlyWagePart=0;
static int present=0,absent=0,days=0,workedHours=0;
public static int count,i,num=1,z=1;
public static String company,type;

static HashMap<String,Integer> map=new HashMap<String,Integer>();

public static void getDetails()
	{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter no.of companies : ");
				count=s.nextInt();
		  		CompanyWageComputation id[] = new CompanyWageComputation[count];

		for(i=0,z=1;i<count;i++,z++)
			{
				System.out.println("\n---------------------------------------------------------");
				System.out.println("Enter the name of the company : " + z);
				company=s.next();
				computeWage();
			}
	}

public static void showDetails(String type)
	{
				System.out.println("Monthly Wage of "+ company + type +" Employee : " + map.get(company));
	}

public static void computeWage()
	{

				System.out.println("Calculating Wage...");
				Random rand = new Random();
                		int random = rand.nextInt(100);
                		random=random%2;
		switch(random)
			{
			case 0:
		                		dailyWageFull=wageHourFull*dayHour;
						type="(FULL-TIME)";
						System.out.println("Wage Per Day(FULL-TIME) : "+dailyWageFull);
  					for(int i=1;workedHours<96 && present<20 && days<31;i++){
                 				random = rand.nextInt(100);
                				random=random%2;
   					  if(random==0){
				                monthlyWageFull+=dailyWageFull;
                				present++;days++;workedHours+=5;}
   					  else{
                				days++;}}
   					        map.put(company,monthlyWageFull);
						showDetails(type);
						present=absent=days=workedHours=0;

			break;

			case 1:
          					dailyWagePart=wageHourPart*dayHour;
      						type="(PART-TIME)";
						System.out.println("Wage Per Day(PART-TIME) : "+dailyWagePart);
 					for(int i=1;workedHours<100 && present<20 && days<31;i++){
      						random = rand.nextInt(100);
 				         	random=random%2;
   					  if(random==0){
				      		monthlyWagePart+=dailyWagePart;
      						present++;days++;workedHours+=5;}
 				       	  else{
     		 		          	days++;}}
				      		map.put(company,monthlyWagePart);
						showDetails(type);
						present=absent=days=workedHours=0;
			break;
			default:
  				        	System.out.println("Invalid");
			break;
			}
	}
}

public class CompanyWageCollections extends EmpWageBuilder
{
	public static void main(String[] args)
		{
			System.out.println("-----------------------------------------------------------");
			System.out.println(".... Welcome to Employee Wage Computation Portal ....");
			System.out.println("-----------------------------------------------------------");
			EmpWageBuilder obj=new EmpWageBuilder();
			obj.getDetails();
			System.out.println("\n-----------------------------------------------------------");
			System.out.println("Enter the name of the company you want to search : ");
			Scanner s=new Scanner(System.in);
			String find=s.next();
			System.out.println("Wage of "+ find +" : "+ map.get(find));
		}
}
