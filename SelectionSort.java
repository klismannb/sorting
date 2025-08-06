import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] heightOfBooks = { 29, 10, 14, 37, 13 };
		System.out.println("List Height of the books: " + Arrays.toString(heightOfBooks));

		selectionSort(heightOfBooks);

		System.out.println("Sorted List Height of the books: " + Arrays.toString(heightOfBooks));
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int counter = 0; counter < n; counter++) {
			int minIndex = counter;

			for (int counter1 = counter + 1; counter1 < n; counter1++) {
				if (arr[counter1] < arr[minIndex])
					minIndex = counter1;
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[counter];
			arr[counter] = temp;
		}
	}
}
