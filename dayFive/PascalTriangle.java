package dayFive;


//          1  
//          1 1 
//          1 2 1 
//          1 3 3 1 
//          1 4 6 4 1 
//          1 5 10 10 5 1 

public class PascalTriangle {

	public static void printPascal(int n) {
		for(int line=0;line<n;line++) {
			for(int i=0;i<=line;i++)
				System.out.print(bimonialCofficient(line,i)+" ");
				System.out.println();
			}
		}
	
		
		public static int bimonialCofficient(int n,int k) {
			int res=1;
			if(k>n-k)
				k=k-n;
			
			for(int i=0;i<k;i++) {
				res*=(n-i);
				res/=(i+1);
				
			}
			return res;
		}
	
		public static void main(String [] args) {
			printPascal(5);
		}
}
