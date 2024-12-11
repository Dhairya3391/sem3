
import java.util.*;
class Employee
{
	static int eid=0;
	static String name;
	static String des;
	static int salary=0;

	public void emp()
	{
		System.out.println("id is :"+eid);
		System.out.println("Name is :"+name);
		System.out.println("Des is :"+des);
		System.out.println("Salary is :"+salary);
	}

	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Eid");
		eid=s1.nextInt();
		System.out.println("Enter Name");
		name=s1.next();
		System.out.println("Enter Des");
		des=s1.next();
		System.out.println("Enter Salary");
		salary=s1.nextInt();
	    System.out.println();
	    System.out.println();
	    Employee e1=new Employee();
	    e1.emp();
		
	}
}