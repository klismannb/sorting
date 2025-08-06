import java.util.Arrays;


public class InsertionSortReverted {
	public static void main(String[] args) {
		String[] names = {"Augusta", "Ria", "Jodee", "Sophia", "James"};

		System.out.println("Names: " + Arrays.toString(names));

		insertionSortReverted(names);

		System.out.println("Names: " + Arrays.toString(names));
	}

	public static void insertionSortReverted(String[] arr) {
		for (int counter1 = 1; counter1 < arr.length; counter1++) {
			String key = arr[counter1];

			int counter2 = counter1 - 1;

			while (counter2 >= 0 && arr[counter2].compareTo(key) < 0) {
				arr[counter2 + 1] = arr[counter2];
				counter2--;
			}

			arr[counter2 + 1] = key;
		}
	}
}
