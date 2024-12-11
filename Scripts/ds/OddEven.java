import java.util.*;
public class OddEven
{
	public static void main(String s[])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		if(x%2==0)
		{
			System.out.println("The number is even");
		}
		if(x%2==1)
		{
			System.out.println("The number is odd");

		}
		else{
			System.out.println("No number entered");
		}
	}
}