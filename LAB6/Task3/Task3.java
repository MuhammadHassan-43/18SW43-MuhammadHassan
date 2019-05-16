class Reverse
{
		int a;
		char ch;
				public void print(int c, char m)
				{
				 	 a=c;
					ch=m;
					for(int i=1;i<=a;i++)
						{
						System.out.print(ch);
						}
				}
				public void print(char m, int c)
				{
				    ch=m;
				    a=c;
					for(int i=1;i<=a;i++)
						{
						System.out.print(ch);
						}
				}

}
class Task3
{
		public static void main(String args[])
		{
				Reverse r=new Reverse();
				r.print(5,'a');
				System.out.println();
				r.print('c',8);
		}
}