package day2;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		int num[]=new int[] {10,11,13,23,15,7,3};
		int smallest=num[0];
		int largest=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}else if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		System.out.println("Largest "+largest);
		System.out.println("Smallest "+smallest);
	}
}
