import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] items = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int target = 8;

		int left = 0;
		int right = items.length;

		System.out.println("List items: " + Arrays.toString(items));
		System.out.println("Target: " + target);

		while (left < right) {
			int middle = (right + left)/2;

			System.out.println("Middle item index: " + middle);
			System.out.println("Current middle value: " + items[middle]);


			if (items[middle] == target) {
				System.out.println("Found the number");
				break;
			} else if (items[middle] < target) {
				left = middle;
			} else {
				right = middle;
			}
		}
	}
}
