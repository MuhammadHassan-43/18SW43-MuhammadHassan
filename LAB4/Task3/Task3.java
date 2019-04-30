import java.util.Scanner;
class Task3{
	public static void main(String[]args)
	{
		int n,num;
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(i+"---Number: ");
			num=in.nextInt(); 				  
			sum+=num;
		}
		System.out.println("Sum of all numbers: "+sum);

	}
}