package day3;

public class StringPermutation {

	public static void main(String[] args) {
		String str="ABC";
		int n=str.length();
		
		StringPermutation permutation=new StringPermutation();
		permutation.permuate(str,0,n-1);
	}
	
	public void permuate(String str,int l,int r) {
		if(l==r) {
			System.out.println(str);
		}
		else {
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				permuate(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	
	public String swap(String a,int i,int j) {
		char temp;
		char[] charArray=a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
		
	}
}
