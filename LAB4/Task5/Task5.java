import java.util.Scanner;
class Task5
{
	public static void main(String[] args) {
		int n,max;
		Scanner in=new Scanner(System.in);
		System.out.println("Please Enter Number Of Elements :");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Elements Of Array :");
		for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}	
	max=a[0];
	for(int i=0;i<n;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println("Maximum value :"+max);

	}
}