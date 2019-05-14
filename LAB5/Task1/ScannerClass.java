public class ScannerClass
{
	private String name;
	private int age;
	private float marks;
	ScannerClass(String name, int age, float marks){
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public void show(){
		
		System.out.println();
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Marks:"+marks);	
		}
}