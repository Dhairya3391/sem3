import java.util.*;
class pro_seq
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int flag=0;
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter element at "+i+"=");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter");
		int us=sc.nextInt();

		for (int j=0;j<5 ;j++ )
		 {
			if(arr[j]==us)
			{
				flag=1;
				break;

			}

		}

		if(flag==1)
		{
			System.out.println("Search Successful");
		}
		else
		{
			System.out.println("Unsuccess");
		}
	}
}