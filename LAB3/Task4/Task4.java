import java.util.Scanner;
class Task4{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 int num1, num2;
		 char op;

    System.out.println( "\nEnter operator either + or - or * or /: ");
    op=input.next().charAt(0);

    System.out.println("Enter two operands: ");
    System.out.println("Enter First Number :");
    num1=input.nextInt();
    System.out.println("Enetr Second Number");
    num2=input.nextInt();

    switch(op)
    {
        case '+':
            System.out.println("Answer:"+ (num1+num2) );
            break;

        case '-':
            System.out.println("Answer:"+(num1-num2));
            break;

        case '*':
            System.out.println("Answer:"+num1*num2);
            break;

        case '/':
            System.out.println("Answer:"+(num1/num2));
            break;

        default:
            // If the operator is other than +, -, * or /, error message is shown
            System.out.println( "Error! operator is not correct");
            break;
    }
}
}