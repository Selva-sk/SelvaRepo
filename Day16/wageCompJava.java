import java.util.Random;

public class wageCompJava{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int random = rand.nextInt(100);

		System.out.println("Checking Employee Attendance...");

	if(random>50)
		System.out.println("Employee is Present");
	else
		System.out.println("Employee is Absent");

}
}
