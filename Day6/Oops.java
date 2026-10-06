package Day6;

import java.util.Scanner;

public class Oops {

	private int rollNumber;  
	private String studentName;
	private double percentage;
	
	public Oops()
	{
		rollNumber=101;
		studentName="Rajesh";
		percentage=50.0;
	}
	public Oops(int a, String b, double c)
	{
		rollNumber=a;
		studentName=b;
		percentage=c;
	}
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter roll number");  //101
		rollNumber=sc.nextInt();
		
		System.out.println("Please enter Student name");  //Alice
		studentName=sc.next();
		
		System.out.println("Please enter Percentage");  //78.5
		percentage=sc.nextDouble();
	}
	
	public void displayStudent()
	{
		System.out.println("Roll Number is "+rollNumber); //Roll Number is 101
		System.out.println("Student name "+studentName);  //Student name Alice
		System.out.println("Percentage is "+percentage);  //Percentage is 78.5
	}
	public boolean searchByRollNumber(int rno)
	{
		if(rollNumber==rno)
			return true;
		else
			return false;
		
	}
	public boolean searchByStudentName(String searchedstudName)
	{
		if(studentName.equalsIgnoreCase(searchedstudName))
			return true;
		else
			return false;
	}
}