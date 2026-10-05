package Day5;

public class StringCount {

	public static void main(String[] args) {
		String sentence="I am studying java in fsd java is a program lang and java is good";
		String search="good";
		int searchStart=0;
		int index=0;
		int occuranceCounter=0;
		
		do
		{
			index=sentence.indexOf(search,searchStart);
			if(index!=-1)
			{
			occuranceCounter++;
			
			}
			searchStart+=index+search.length();
		}
		while(index!=-1);
		System.out.println(occuranceCounter);

	}

}
