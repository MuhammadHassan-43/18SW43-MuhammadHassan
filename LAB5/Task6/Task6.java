class Task6{
	public static void main(String[] args) {
		
		Student s=new Student("Hassan",43,18,"SW");
		MarkSheet m=new MarkSheet(90,99,96);
	
		CreateStudentDetail c=new CreateStudentDetail(s,m);
		c.showDetail();
	}
	
}