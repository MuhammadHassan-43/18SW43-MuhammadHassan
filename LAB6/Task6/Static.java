class Static
{
		static int counter;
		
		static {
			counter=0;
		}
		public Static()
		{
		counter+=10;
		System.out.println(counter+ " Elements"); 
		}
}
