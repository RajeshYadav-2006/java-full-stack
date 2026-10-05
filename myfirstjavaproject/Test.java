package myfirstjavaproject;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of person 1");
		int age1=sc.nextInt();
		System.out.println("Enter the age of person 2");
		int age2=sc.nextInt();
	    int sumAge=age1+age2;
	    System.out.println("The sum of AGe is:"+sumAge);
	}

}

/*
mahendra sign dhoni
PascalCase : MahendraSinghDhoni //For class name we will follow pascal case
camelcase : mahendraSinghDhoni
*/