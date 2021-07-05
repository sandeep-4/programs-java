package day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumNumbersToMatchGivenNumber {

//	find all pairs of an integer array whose sum is equal to a given number
	public static void main(String args[]) {
		print(getRandomArray(9), 23);
		print(getRandomArray(7), 11);
	}

	@SuppressWarnings("unchecked")
	public static void printPairsSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		@SuppressWarnings("rawtypes")
		Set set = new HashSet(numbers.length);
		for (int value : numbers) {
			int target = n - value;
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.println(value + " " + target);
			}
		}
	}

	public static void print(int[] random, int k) {
		System.out.println("Random Integer array : " + Arrays.toString(random));
		System.out.println("Sum : " + k);
		System.out.println("pair of numbers from an array whose sum equals " + k);
		
		printPairsSet(random, k);
	}
	
	public static int[] getRandomArray(int length) {
		int [] randoms=new int[length];
		for(int i=0;i<length;i++) {
			randoms[i]=(int) (Math.random()*15);
		}
		return randoms;
	}
}
