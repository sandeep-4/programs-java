package dayFive;

public class EvenOddWoutArthmaticOperator {
	public static boolean isEven(int n) {
		boolean isEven=true;
		for(int i=1;i<=n;i++) 
			isEven=!isEven;
		
		return isEven;
	}
	
	
	public static void main(String []args) {
		int n=11;
		if(isEven(n)) {
			System.out.println("Even "+n);
		}else {
			System.out.println("Odd "+n);
		}
	}
}
