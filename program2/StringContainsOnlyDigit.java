package program2;

public class StringContainsOnlyDigit {
	
	@SuppressWarnings("unused")
	public static boolean onlyDigits(String str,int n) {
		for(int i=0;i<n;i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<'9') {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str="1234";
		int length=str.length();
		
		System.out.println(onlyDigits(str, length));
	}
}
