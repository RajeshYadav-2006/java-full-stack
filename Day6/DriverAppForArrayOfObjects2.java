package Day6;
import java.util.Scanner;
public class DriverAppForArrayOfObjects2 {

	public static void main(String[] args) {
		Oops fsdBatch[]=new Oops[3];
		
		for(int i=0;i<fsdBatch.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter roll number");   //101   102   103
			int a=sc.nextInt();
			
			System.out.println("Please enter Student name");  //Alice Ben   Chris
			String b=sc.next(); 
			
			System.out.println("Please enter Percentage");     //78.5 88.5   98.5
			double c=sc.nextDouble();
			
			fsdBatch[i]=new Oops(a,b,c);
		}
			
		
		for(int i=0;i<fsdBatch.length;i++)
			fsdBatch[i].displayStudent();

	}

}
