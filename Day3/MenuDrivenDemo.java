package Day3;
import java.util.Scanner;
public class MenuDrivenDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1:");
		double num1=sc.nextDouble();
		System.out.println("Enter Number 2:");
		double num2=sc.nextDouble();
		int choice=0;
		do
		{
		System.out.println("***Menu***");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("0.Exit");
		System.out.println("Enter your choice:");
	    choice=sc.nextInt();
	    double result = 0.0;
	    switch(choice)
	    {
	    case 1: result = num1+num2; break; 
	    case 2: result = num1-num2; break; 
	    case 3: result = num1*num2; break; 
	    case 4: result = num1/num2; break; 
	    case 0: System.exit(0);
	    default : System.out.println("Invalid Input");
	    }
	    System.out.println("Result is :" +result);
	    }while(choice!=0);	  
	}

}
