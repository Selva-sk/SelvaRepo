package EmployeeDetails;

interface AddressBook  // Interfaces to declare abstract method
{
void showDetails();
}

class Developer
{
public static int salary,dailyWage; //static attributes
public static String empName,dept;

public static void calculateSalary(int dailyWage)
{
		System.out.println(".... Method Overriding to find Developer Salary ....");
		salary=dailyWage*60;
		System.out.println("Developer Salary:" + salary);
}
}



public class Employee extends Developer implements AddressBook //class extends both parent class and implemets interface
{
Employee() // default constructor
{
		System.out.println(".... Default constructor executed ....");
		empName="Selva";
		dept="IT";
}
public static  void calculateSalary(int dailyWage)
{
		salary=dailyWage*30;
		System.out.println("IT Employee Salary : " + (double)salary);
}
public static void calculateSalary(double dailyWage) //Method Overloading
{
		System.out.println(".... Method Overloading....");
		salary=(int)dailyWage*30; //Typecasting
		System.out.println("IT Employee Salary after Typecasting : " + salary);
}

public final void showDetails() // final method
{
		System.out.println(".... IT Employee Details ....");
		System.out.println(empName + "\n" + dept);
}


public static void main(String[] args)
{
		Employee details=new Employee(); //child class object
		details.showDetails();
		details.calculateSalary(1000);
		details.calculateSalary(1000.00);
		details.callParent();
}
public void callParent()
{
super.calculateSalary(1000); // calling parent class method using super keyword
}
}

