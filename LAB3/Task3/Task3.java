
import java.util.Scanner;
class Task3{
	public static void main(String[] args) {
	 char alp;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a Character : ");
     alp = input.next().charAt(0);
     switch (alp)
     {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
          System.out.println(alp +  " is a Vowel.");
         break;
         default:
         System.out.println(alp +  " is a Consonant."); 
     }

	}
}