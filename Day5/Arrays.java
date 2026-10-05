package Day5;

public class Arrays {

	public static void main(String[] args) {
		int matrix[][]= {{0,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(matrix[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
