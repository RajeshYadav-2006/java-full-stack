package Day5;

import java.util.Scanner;

public class Array2DDemo {

	public static void main(String[] args) {
		int matrix[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter a Number:");
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				System.out.println(matrix[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
