package day3;

public class StringRecursionReverse {
	public static void main(String[] args) {
		String myStr="Hello Bordie";
		
		String reversed=reverseString(myStr);
		
		System.out.println(reversed);
	}
	
	public static String reverseString(String myString){
		if(myString.isEmpty()) {
			System.out.println("String empty");
			return myString;
		}
		System.out.println("String passesd "+myString.substring(1));
		return reverseString(myString.substring(1))+myString.charAt(0);
	}
}
