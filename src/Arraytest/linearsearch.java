package Arraytest;

public class linearsearch {
	public static int Search(int[] number, int key) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int key = 2;
		int index = Search(numbers, key);

		if (index == -1) {
			System.out.println("key is not found at index=" + key);
		} else {
			System.out.println("key is found at index=" + key);
		}

	}

}