package program2;

public class VovelAndConsunantNumber {

	public static void main(String[] args) {
		String line = "This is great";
		int vovel = 0, consunant = 0, digits = 0, spaces = 0;

		line = line.toLowerCase();

		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vovel;
			} else if ((ch >= 'a' && ch <= 'z')) {
				++consunant;
			} else if (ch >= '0' && ch <= '9') {
				++digits;
			} else if (ch == ' ') {
				++spaces;
			}
		}
		System.out.println("Vowels: " + vovel);
		System.out.println("Consonants: " + consunant);
		System.out.println("Digits: " + digits);
		System.out.println("White spaces: " + spaces);
	}
}
