package day2;

import java.util.ArrayList;
import java.util.List;

public class FindMissingInBetween1And100 {

	public static List<Integer> findDisappearedNumber(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int index = Math.abs(num[i]);
			if (num[index - 1] > 0) {
				num[index - 1] *= -1;

			}
		}
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				res.add(i + 1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 7 };

		System.out.println(findDisappearedNumber(a));
	}

}
