package programThree;

public class DecimalToBinary {

	static void decimalToBinar(int n) {
		int binNum[]=new int[100];	
	int i=0;
	while(n>0) {
		binNum[i]=n%2;
		n=n/2;
		i++;
	}
	
	for(int j=i-1;j>=0;j--) {
		System.out.println(binNum[j]);
	}
	
	}
	
	public static void main(String[] args) {
		decimalToBinar(23);
	}
}
