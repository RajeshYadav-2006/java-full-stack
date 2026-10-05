package Day5;

public class MaxNumberFromAnArray {

	public static void main(String[] args) {
		int arr[] = {10,8,9,16,12};
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);

	}

}
