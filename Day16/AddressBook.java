import java.util.*;
import java.awt.*;

public class Label extends Component implements Accessible
{
static String firstname;
static String lastname;
static String address;
static String city;
static String state;
static int zip;
static int phone;

public static void main(String[] args)
{
Label Book=new Label();
Book.getDetails();

Frame f= new Frame("Welcome to Address Book..");  
    Label l1,l2;  
    l1=new Label(firstname);  
    l1.setBounds(50,100, 100,30);  
    l2=new Label(zip);  
    l2.setBounds(50,150, 100,30);  
    f.add(l1); f.add(l2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  

}

public static void getDetails()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter your First Name:");
firstname=input.next();
System.out.println("Enter your Last Name:");
lastname=input.next();
System.out.println("Enter your Address:");
address=input.next();
System.out.println("Enter your City:");
city=input.next();
System.out.println("Enter your State:");
input.nextLine();
state=input.nextLine();
System.out.println("Enter your Zipcode:");
zip=input.nextInt();
System.out.println("Enter your Phone number:");
phone=input.nextInt();
}
}
