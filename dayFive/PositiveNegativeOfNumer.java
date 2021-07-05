package dayFive;

public class PositiveNegativeOfNumer {

	public void posOrNeg(int n) {
		if(n>=0) {
			System.out.println(n+" is postive number");
		}else {
			System.out.println(n+" is negative number");			
		}
	}
	
	public static void main(String[] args) {
		PositiveNegativeOfNumer pon=new PositiveNegativeOfNumer();
		pon.posOrNeg(7);
		pon.posOrNeg(-1);
	}
}
