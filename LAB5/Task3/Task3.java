class Dog{
	String name;
	String breed;
	int age;

public 	void setDetails(String n,String b,int a){
		name=n;
		breed=b;
		age=a;
}

	void showDetails(){
		if(name.isEmpty() && breed.isEmpty()){
			System.out.print("details are unavailable");
			}
		else{
		System.out.println("Name :"+name);
		System.out.println("Breed :"+breed);
		System.out.println("Age :"+age);
	}
}
}
class Task3{
	public static void main(String[] args) {
		Dog d=new Dog();
		
		d.setDetails("Robert","Bull Dog",8);
		d.showDetails();
		
		

	}
}