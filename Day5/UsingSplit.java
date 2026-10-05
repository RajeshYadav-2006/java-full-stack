package Day5;

public class UsingSplit {

	public static void main(String[] args) {
		String sentence="one two one three one four one five one six one seven";
		String search="one";
		String words[]=sentence.split(" ");
	
		int occuranceCounter=0;
		
		for(String word:words)
		{
			if(word.equalsIgnoreCase(search))
				occuranceCounter++;
		}
		System.out.println(occuranceCounter);

	}

}
