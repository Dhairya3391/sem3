import java.util.*;

class Vovel extends Main {
	String str;
	int ca = 0, ce = 0, ci = 0, co = 0, cu = 0;

	void count() {
		str = s;
		if (str.charAt(ca) == 'a' || str.charAt(ca) == 'A') {
			ca = ca + 1;
		}
		if (str.charAt(ce) == 'e' || str.charAt(ce) == 'E') {
			ce = ce + 1;
		}
		if (str.charAt(ci) == 'i' || str.charAt(ci) == 'I') {
			ci = ci + 1;
		}
		if (str.charAt(co) == 'o' || str.charAt(co) == 'O') {
			co = co + 1;
		}
		if (str.charAt(cu) == 'u' || str.charAt(cu) == 'U') {
			cu = cu + 1;
		}
	}

	void disp() {
		System.out.println("Num of a is" + ca);
		System.out.println("Num of e is" + ce);
		System.out.println("Num of i is" + ci);
		System.out.println("Num of o is" + co);
		System.out.println("Num of u is" + cu);
		ca = ce = ci = co = cu = 0;

	}
}

class Main {
	Scanner sc = new Scanner(System.in);
	String s;

	public static void main(String[] args) {
		while(true)
		{
			if(str.equals('quit'))
			{
				break;
			}
			else
			{
				System.out.println("Enter the string");
				s=sc.next();
				Vovel v1=new Vovel();
				v1.count();
				v1.disp();
				
			}
		}
	}
}