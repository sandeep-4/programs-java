package program;

public class DublicateRemoveInArray {

	public static int dublicate(int arr[],int n) {
		if(n==0 || n==1) {
			return n;
		}
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		//original array
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	
	public static void main(String [] args) {
	
		int arr[]= {2,3,3,4,7,7,8,12,13};
		int length=arr.length;
		length=dublicate(arr,length);
		//print
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
		}
	}
}
