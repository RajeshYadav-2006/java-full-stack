package Day5;

public class Array2DDemo2 {

	public static void main(String[] args) {
		//int matrix[][]=new int[3][3];
		
		int matrix[][]= {{10,24,30},{26,51,34},{37,29,44}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		int max=matrix[0][0];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]>max)
					max=matrix[i][j];
			}	
		}
		System.out.println("The maximum number is :"+max);
		for(int i=0;i<matrix.length;i++)
		{
			int rowMax=matrix[i][0];
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]>rowMax)
				{
					rowMax=matrix[i][j];
				}
			}
			System.out.println("Row "+(i+1)+ " maximum:" +rowMax);
			}
	}

}


