import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] items = new int[] {1, 2, 3, 4, 5, 6};
		int target = 4;

		System.out.println("List items: " + Arrays.toString(items));
		System.out.println("Target: " + target);

		for (int i = 0; i < items.length; i++) {
			System.out.println("Current item: " + items[i]);
			if (items[i] == target) {
				System.out.println("Found the number");
				break;
			}
		}
	}
}
