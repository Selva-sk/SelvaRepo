import java.util.*;

public class AddressBook{
String firstname;
String lastname;
String address;
String city;
String state;
int zip;
int phone;

public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter zip code:");
zip=input.next();
System.out.println(zip);
}
}
