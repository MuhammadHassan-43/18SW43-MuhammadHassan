import java.util.*;

class Array{

	int size = 10;
	int num[] = new int[size];
	
	void GetNum(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter An Array: ");
		for(int i = 0; i < size; i++){
			num[i] = in.nextInt(); 
			
		}
	}

	int even = 0; int odd = 0;

	void print(){
		for(int j = 0; j < size; j++){
			if(num[j]%2 == 0){
				even++;
				
			}
			else{
				odd++;
			
			}
		}
		System.out.println("Number of even numbers: "+even);
		System.out.print("Number of odd numbers: "+odd);
	}
}
class Task2{
	public static void main(String[] args) {
		Array a = new Array();
		a.GetNum();
		a.print();

		
	}
}