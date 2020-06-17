import EmployeeDetails.*;  //Importing the pacakage EmployeeDetails from another file

public class Managers
{
public static void main(String args[])
{
Developer ID=new Developer(); //creating object for the imported class
ID.calculateSalary(100); //calling the method of imported class
System.out.println("END");
}
}
