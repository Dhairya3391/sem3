import java.util.*;

class p1
{

  public static void main (String[]args)
  {
    int n, temp;
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the Length of array");
    n = sc.nextInt ();
    int a[] = new int[n + 1];
    int arr[] = new int[n + 1];
    for (int i = 0; i < n; i++)
    {
	System.out.println ("Enter the value of" + i + "index");
	a[i] = sc.nextInt ();
    }
    for (int i = 0; i < n; i++)
    {
	System.out.println (" value of" + i + "index is" + a[i]);
    }
    System.out.println ("Enter the element");
    temp = sc.nextInt ();
    for (int i = 0; i < n; i++)
    {
	if (temp < a[i])
	{
	    a[i + 3] = a[i + 2];
	    a[i + 2] = a[i + 1];
	    a[i + 1] = a[i];
	    a[i] = temp;
	    break;
	}
}
    for (int i = 0; i < n + 1; i++)
    {
	System.out.println (" value of" + i + "index is" + a[i]);
    }
  }
}
