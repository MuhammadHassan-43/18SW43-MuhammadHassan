import java.util.Scanner;
class Task2{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);

		int a,b,c;
	System.out.println("Enter Table Of :");
	c=in.nextInt();

	System.out.println("Enetr Starting Point :");
	a=in.nextInt();

	System.out.println("Enter Ending Point :");
	b=in.nextInt();

		for(int x=a;x<=b;x++)
		{
			int z=c*x;
			System.out.println(c+"x"+x+"="+z);
		}
		System.out.println();


	}
}