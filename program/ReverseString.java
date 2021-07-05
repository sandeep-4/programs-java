package program;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String [] args) {
	ReverseString reverse=new ReverseString();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=sc.nextLine();
	System.out.println("Reverse is :");
	System.out.println(reverse.reverseString(str));
	
	}
	public String reverseString(String string) {
		String rev="";
		for(int i=string.length();i>0;--i) {
			rev=rev+(string.charAt(i-1));
		}
		return rev;
	}
	
}
