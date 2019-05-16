class Task5
{
		public static void main(String args[])
		{
			Student s[]=new Student[10];
			Student s1=new Student();
			s1.setInfo("Hassan",18,"MPS");
			s[0]=s1;
			Student s2=new Student();
			s2.setInfo("Saad",17,"HYD");
			s[1]=s2; 
			Student s3=new Student();
			s3.setInfo("Ali ",19);
			s[2]=s3; 
			Student s4=new Student();
			s4.setInfo("Saeed",20,"HYD");
			s[3]=s4; 
			Student s5=new Student();
			s5.setInfo("Anees",19,"Larkana");
			s[4]=s5; 
			Student s6=new Student();
			s6.setInfo("Murtaza",20);
			s[5]=s6; 
			Student s7=new Student();
			s7.setInfo("Osama",17);
			s[6]=s7; 
			Student s8=new Student();
			s8.setInfo("Fayaz",19);
			s[7]=s8; 
		 	Student s9=new Student();
			s9.setInfo("Hasan",18);
			s[8]=s9; 
		 	Student s10=new Student();
			s10.setInfo("Farooq",19,"MPS");
			s[9]=s10; 
			 for(int i=0;i<10;i++)
				 {
				s[i].display();		
				 }
    	}
}