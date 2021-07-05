package day3;

//find the longest palindromic substring in str
public class LongestPalendromicSubString {

	public static void printSubString(String str,int low,int high) {
		for(int i=low;i<=high;i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	static int longestPalendromicSubString(String str) {
		int n=str.length();
		int maxLength=1,start=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int flag=1;
				
				for(int k=0;k<(j-i+1)/2;k++) {
					if(str.charAt(i+k)!=str.charAt(j-k)) {
						flag=0;
					}
				if(flag!=0 && (j-i+1)> maxLength) {
					start=1;
					maxLength=j-i+1;
				}
				}
				
			}
		}
		printSubString(str, start, start+maxLength-1);
		return maxLength;
		
	}
	
	public static void main(String[] args)
	{
	    String str = "codeiscode";
	    System.out.println("Length is: "
	         + longestPalendromicSubString(str));
	}
	
}
