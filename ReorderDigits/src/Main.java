import java.util.Arrays;

public class Main {
	/*
	 * PO Weekly Coding Coding Challenge 9/12/2022 - 9/16/2022
	 */

	public static int[] reorderDigits(int[] testArr, String testOrder) {

		int[] result = new int[testArr.length];
		int idx = 0;
		for (int num : testArr) {
			char[] toChar = Integer.toString(num).toCharArray();

			Arrays.sort(toChar);

			if (testOrder.equals("asc")) {
				result[idx] = Integer.parseInt(new String(toChar));
			} else {
				char[] descChar = new char[toChar.length];
				for (int i = toChar.length - 1; i >= 0; i--) {
					descChar[(descChar.length - 1) - i] = toChar[i];
				}
				result[idx] = Integer.parseInt(new String(descChar));
			}
			idx++;
		}

		return result;
	}

	public static void main(String[] args) {

		int[] testArr = { 515, 341, 98, 44, 211 };
		String testOrder = "asc";

		System.out.println(Arrays.toString(reorderDigits(testArr, testOrder)));

		testOrder = "desc";

		System.out.println(Arrays.toString(reorderDigits(testArr, testOrder)));

		testArr = new int[] { 63251, 78221 };
		testOrder = "asc";

		System.out.println(Arrays.toString(reorderDigits(testArr, testOrder)));

		testOrder = "desc";

		System.out.println(Arrays.toString(reorderDigits(testArr, testOrder)));

		testArr = new int[] { 1, 2, 3, 4 };
		testOrder = "asc";
		
		System.out.println(Arrays.toString(reorderDigits(testArr, testOrder)));
		
		testOrder = "desc";
		
		System.out.println(Arrays.toString(reorderDigits(testArr, testOrder)));

	}
}
