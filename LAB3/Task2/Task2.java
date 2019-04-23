import java.util.Scanner;
class Task2
{
        public static void main(String args[])
        {
	   long units;

	   Scanner sc=new Scanner(System.in);

	   System.out.println(" Enter number of units:");

           units=sc.nextLong();

     	   double billpay=0;

           if(units<=50){
		billpay=units*10;
}
    	    else if(units>50 && units<=100){
		billpay=50*10+(units-50)*15;}

	    else if(units>100 && units<=200){
		billpay=50*10+(100-50)*15+(units-100)*20;
}
 	else if(units>200 && units<=300){
		billpay=50*10+(100-50)*15+(200-100)*20+(units-200)*25;
}
	else if(units>300){
		billpay=50*10+(100-50)*15+(200-100)*20+(300-200)*25+(units-300)*30;

              System.out.println("Bill to pay : " + billpay);
   }
}
}