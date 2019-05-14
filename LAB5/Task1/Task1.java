import java.util.Scanner;
class Task1{
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		String name=in.nextLine();
		System.out.print("Enter Age:");
		int age=in.nextInt();
		System.out.print("Enter Marks:");
		float marks=in.nextFloat();

		ScannerClass c=new ScannerClass(name,age,marks);
		c.show();
	}
}