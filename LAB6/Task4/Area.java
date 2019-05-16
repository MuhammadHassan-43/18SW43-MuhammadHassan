class Area
{
		double length,breadth,result;
		public void square(double length)
				{
				   this.length=length;
				    result=length*length;
					System.out.println("The area of square is= "+result);
				
				}
				public void rectangle(double length, double breadth)
				{
				      this.length=length;
				      this.breadth=breadth;
				    result=length*breadth;
					System.out.println("The area of rectangle is= "+result);
				}

}
