package day3;

public class StringPalendrom {

	static boolean isPalendrom(String str){
	int i=0,j=str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
	}
	
	public static void main(String [] args) {
		String str="inni";
		if(isPalendrom(str)) {
			System.out.println("Yes palendrom");
		}else {
			System.out.println("Not palendrom");
		}
	}
}
