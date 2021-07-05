package program2;

import java.nio.charset.StandardCharsets;

public class ByteArrayToString {
	public static void main(String[] args) {
		String s = "Hello to the world";
		byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
		String string = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(string);
	}
}
