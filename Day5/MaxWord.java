package Day5;

public class MaxWord {

	public static void main(String[] args) {
		String name="Mahendra Singh Dhoni";
		String words[]=name.split(" ");
		
		int max=0;
		String maxWord="";
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>max) {
				max=words[i].length();
				maxWord=words[i];
			}
		}
		System.out.println("Biggest word in sentence is : "+maxWord);
		

	}

}
