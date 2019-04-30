class Task1
{
	public static void main(String args[])
	{
		System.out.println("i :");
		for(int x=1;x<=5;x++)
		{
			for(int j=1;j<=x;j++)
			{
			System.out.print("*");
			}
			System.out.println();
	}

System.out.println("ii :");
int k=0,rows=5;
               for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }


 System.out.println("iii :");
  for(int i = 5; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }









}
}