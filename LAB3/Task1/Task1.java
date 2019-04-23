
import java.util.Scanner;
class Task1{
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
    
    int cpp,ds,op; 
	
	System.out.println("Enter marks obtained in C++ : ");
	cpp = in.nextInt();
	System.out.println("Enter marks obtained in Data Structures : ");
    ds = in.nextInt();
    System.out.println("Enter marks obtained in Operating Systems : ");
    op = in.nextInt();
    
    int obtained_marks = cpp+ds+op;
    float percentage = obtained_marks*100/300 ;
    String grade="Invalid";

    if(percentage>=90){ grade = "A" ;}
    if(percentage>80 && percentage<90){ grade = "B" ;}
    if(percentage>70 && percentage<=80){  grade = "C" ;}
    if(percentage>60 && percentage<=70){ grade = "D" ;}
    if(percentage<60){ grade = "Fail" ;}

    System.out.println("Total obtaine marks : " + obtained_marks);
    System.out.println("Percentage : " + percentage);
    System.out.println("Grade : " + grade);
    
	}
}