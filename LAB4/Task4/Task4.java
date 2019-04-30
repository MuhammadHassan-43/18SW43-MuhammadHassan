import java.util.Scanner;
class Task4{
	public static void main(String[]args)
	{
		int rows=3;
		int col=3;

		Scanner in=new Scanner(System.in);
		int [][]A=new int[rows][col];
		int [][]B=new int[rows][col];
		int [][]C=new int[rows][col];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				System.out.print("A["+i+"]["+j+"]= ");
				A[i][j]=in.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				System.out.print("B["+i+"]["+j+"]= ");
				B[i][j]=in.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				C[i][j]=A[i][j]+B[i][j];
				System.out.println("C["+i+"]["+j+"]= "+ C[i][j]);
			}
		}
	}
}