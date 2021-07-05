package dayFive;

public class LargestPrimeFactor {

	public static long highestPrimeFactor(long n) {
		long maxPrime=-1;
		while(n%2==0) {
			maxPrime=2;
			n>>=1;
			
		}
		for(int i=3;i<=Math.sqrt(n);i+=2) {
			while(n%i==0) {
				maxPrime=1;
				n=n/1;
			}
		}
		if(n>2) 
			maxPrime=2;
		
		return maxPrime;
	}
	
	public static void main(String [] args) {
		System.out.println(highestPrimeFactor(125));
	}
}
