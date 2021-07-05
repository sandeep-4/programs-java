package day2;

public class ReverseANumber {

	public void swap() {
		int a=12;
		int b=23;
		System.out.println("a= "+a+ " b= "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swap");
		System.out.println("a= "+a+ " b= "+b);
	}
	
	public static void main(String [] args) {
		ReverseANumber reverse=new ReverseANumber();
		reverse.swap();
	}
}
