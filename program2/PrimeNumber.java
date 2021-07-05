package program2;

public class PrimeNumber {

	int i,flag;
	public void prime(int n) {

		for (i = 3; i <= n; i=i+2) {
			
			flag=1;
			for(int j=2;j*j<=i;++j) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			
			if(flag==1){
				System.out.println(i);
			}
			
			
//			if (n % 2 == 0) {
//				
//				System.out.println("Not prime " + i + " ");
//			}
//			if (n % i != 0) {
//				System.out.print("Prime " + i + " ");
//			} else {
//				System.out.println("Not prime " + i + " ");
//
//			}
	
		
		}
	}

	public static void main(String args[]) {
		PrimeNumber p = new PrimeNumber();
		p.prime(21);
	}
}
