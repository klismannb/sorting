import java.util.Arrays;


public class InsertionSort {
	public static void main(String[] args) {
		String[] names = {"Zara", "Mia", "Anna", "Sophia", "Ben"};

		System.out.println("Names: " + Arrays.toString(names));

		insertionSort(names);

		System.out.println("Sorted Names: " + Arrays.toString(names));
	}

	public static void insertionSort(String[] arr) {
		int n = arr.length;

		for(int counter1 = 1; counter1 < n; counter1++) {
			String key = arr[counter1];

			int counter2 = counter1 - 1;

			while (counter2 >= 0 && arr[counter2].compareTo(key) > 0) {
				arr[counter2 + 1] = arr[counter2];
				counter2 = counter2 - 1;
			}

			arr[counter2 + 1] = key;
		}
	}
}
