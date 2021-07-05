package program;

public class BubbleSort {

	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}

	// print array
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n ; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int arr[] = { 12, 7, 15, 13, 23, 21, 3 };
		sort.bubbleSort(arr);
		System.out.println("**********");
		sort.printArray(arr);
	}
}
