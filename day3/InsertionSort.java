package day3;

public class InsertionSort {

	
	public void sort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;++i) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	public static void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {7,18,23,21,11,17};
		InsertionSort is=new InsertionSort();
		is.sort(arr);
		print(arr);
	}
}
