package Day5;

public class CountWordsInAString {

	public static void main(String[] args) {
	String name="Mahendra Singh Dhoni";
	String words[]=name.split(" ");
	
	for(String word:words)
	System.out.println(word+ " " + word.length());

	}

}
