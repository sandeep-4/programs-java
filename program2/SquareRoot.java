package program2;

public class SquareRoot {

	public double squareRoot(int n) {
		double sq=n*n;
		return sq;
	}
	
	public static void main(String[] args) {
		SquareRoot square=new SquareRoot();
		double sq=square.squareRoot(7);
		System.out.println("Square root of is "+sq);
	}
	
}
