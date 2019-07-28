class MyCalculator{
	static long Power( int n,int p){
		
		int k=1;
		if(n==0 && p==0){
			throw new ArithmeticException("n and p can not be equal to 0(Zero)"); 
		} 
		else if(n<0 || p<0){
			throw new ArithmeticException("n or p can not be a Negative Number");
		}
		for(int x=1;x<=p;x++)
		{
			k*=n;
		}
		return k;
	}
}
class Task3{
	public static void main(String[] args) {
		try{
			System.out.println(MyCalculator.Power(2,3));
			
		}
		catch(ArithmeticException e){
			System.out.println("Invalid");
		}
	}
}