package myfirstjavaproject;
import java.util.Scanner;
public class Agecheck {
	public static void main(String[] args) {

			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your Age:");
			int age=sc.nextInt();
			
			if(age>=18)
			{
				System.out.println("Adult");
			}
			else
			{
				System.out.println("Minor");
			}
			System.out.println("Thank You");
			
		}

	}
		
	


