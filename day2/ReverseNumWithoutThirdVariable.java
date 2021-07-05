package day2;

public class ReverseNumWithoutThirdVariable {

	public static void main (String [] args) {
		int x=7;
		int y=11;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x= "+x+" y= "+y);
	}
}
