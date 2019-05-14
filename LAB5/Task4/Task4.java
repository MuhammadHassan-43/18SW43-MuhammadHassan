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

	void showtDetails(){
		System.out.println("Name :"+name);
		System.out.println("Roll No :"+year+dept+rollno);
		System.out.println("Batch :"+year);
		System.out.println("Department :"+dept);
			
	}
}
class Task4{
	public static void main(String[] args) {
		Student s=new Student("Muhammad Hassan",43,18,"SW");
	
	
		s.showtDetails();
	}
}