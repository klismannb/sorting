import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] items = new int[] {21, 18, 25, 19, 22};
		System.out.println("List Items: " + Arrays.toString(items));
		
		bubbleSort(items);

		System.out.println("Sorted List Items: " + Arrays.toString(items));
	}

	public static void bubbleSort(int[] items) {
		int n = items.length;

		for(int counter1 = 0; counter1 < n - 1; counter1++) {
			for (int counter2 = 0; counter2 < n - 1 - counter1; counter2++) {
				if (items[counter2] > items[counter2 + 1]) {
					int temp = items[counter2];
					items[counter2] = items[counter2 + 1];
					items[counter2 + 1] = temp;
				}
			}
		}
	}
}
