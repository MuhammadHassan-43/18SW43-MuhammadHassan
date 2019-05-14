class Student{
	String name;
	int rollno;
	int year;
	String dept;

	Student(String n,int r,int y,String d){
		name=n;
		rollno=r;
		year=y;
		dept=d;
	}

	void show(){
		System.out.println("Name :"+name);
		System.out.println("Roll No :"+year+dept+rollno);
		System.out.println("Batch :"+year);
		System.out.println("Department :"+dept);
			
	}
}