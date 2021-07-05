package program;

public class CountOccouranceOfChar {

	public static final int MAX_CHAR = 256;

	public static void getOccouringChar(String str) {
		int count[] = new int[MAX_CHAR];
		int length = str.length();
		for (int i = 0; i < length; i++) {
			count[str.charAt(i)]++;
		}
		char ch[] = new char[str.length()];
		for (int i = 0; i < length; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				// match
				if (str.charAt(i) == ch[j]) {
					find++;
				}
			}
			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}

	}

	public static void main(String[] args) {
		String string = "good";
		getOccouringChar(string);

	}
}
