package day2;

public class FindMultipleDublicateInArray {

	public void printRepeating(int arr[],int size) {
		for(int i=0;i<size;i++) {
			int j=Math.abs(arr[i]);
			if(arr[j] >=0) {
				arr[j]=-arr[j];
			}else {
				System.out.println(arr[j]+" ");
			}
		}
	}
	public static void main(String [] args) {
		FindMultipleDublicateInArray dublicate=new FindMultipleDublicateInArray();
		int arr[]= {1, 2, 3, 1, 3, 6, 6};
		int arr_size=arr.length;
		dublicate.printRepeating(arr, arr_size);
	}
}
