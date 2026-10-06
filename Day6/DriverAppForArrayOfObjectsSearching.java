package Day6;

import java.util.Scanner;

public class DriverAppForArrayOfObjectsSearching {

	public static void main(String[] args) {
		Oops fsdBatch[]=new Oops[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<fsdBatch.length;i++)
		{
			System.out.println("Please enter roll number");  //101
			int a=sc.nextInt();
			
			System.out.println("Please enter Student name");  //Alice
			String b=sc.next();
			
			System.out.println("Please enter Percentage");  //78.5
			double c=sc.nextDouble();
			fsdBatch[i]=new Oops(a,b,c);
		}
		
		for(int i=0;i<fsdBatch.length;i++)
			fsdBatch[i].displayStudent();
		System.out.println("Enter roll number to search");
		int searchRno=sc.nextInt();
		int flag=0;
		for(int i=0;i<fsdBatch.length;i++)
		{
			boolean result=fsdBatch[i].searchByRollNumber(searchRno);
			if(result==true)
			{
				System.out.println("Student Found");
				flag=1;
				break;
				
			}
		}
		if(flag==0)
			System.out.println("Student not found");
		
		System.out.println("Enter student name to search");
		String searchedName=sc.next();
		
		int flag1=0;
		for(int i=0;i<fsdBatch.length;i++)
		{
			boolean result=fsdBatch[i].searchByStudentName(searchedName);
			if(result==true)
			{
				System.out.println("Student Found");
				flag1=1;
				break;
			}
		}
		
		if(flag1==0)
			System.out.println("Student not found");

	}

}
