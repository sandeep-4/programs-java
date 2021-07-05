package day3;

public class DublicateCharInString {

	public static void main(String []args) {
		String string1="Tyller Herro";
		int count;
		//convert string to char
		char string[]=string1.toCharArray();
		System.out.println("Dublicate char are ");
		for(int i=0;i<string.length;i++) {
			count=1;
			for(int j=i+1;j<string.length;j++) {
				if(string[i]==string[j]&&string[i]!=' ') {
					count++;
					string[j]='0';
				}
			}
			if(count>1 && string[i]!='0') {
				System.out.println(string[i]);
			}
		}
	}
	
}
