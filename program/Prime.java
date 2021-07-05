package program;

public class Prime {
	
	public void prime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i!=0) {
				System.out.println("Number is prime "+num);
			}
			else {
			System.out.println("Num is not prime "+num);	
			break;
			}
		}
	}
	
	public static void main(String[] args) {
		 Prime p=new Prime();
		 p.prime(7);
		 p.prime(12);
	}
}
