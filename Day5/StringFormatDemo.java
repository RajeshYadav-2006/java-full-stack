package Day5;

public class StringFormatDemo {

	public static void main(String[] args) {
		String name="Rajesh";
		int age=20;
		double height=5.6;
		System.out.println(String.format("My name is %s Iam %d years old & my height is %2f feets",name,age,height));
		
		System.out.println(String.format("%-10s%5d","Tie",500));
		System.out.println(String.format("%-10s%5d","Belt",700));
		System.out.println(String.format("%-10s%5d","Trousers",1500));
		System.out.println(String.format("%-10s%5d","Total",2200));

	}

}
