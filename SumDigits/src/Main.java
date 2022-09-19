import java.util.Scanner;

public class Main {

	/*
	 * PO Weekly Coding Coding Challenge 9/19/2022 - 9/23/2022
	 */
	
	public static String sumDigits(int N, String[] A) {
		String result = "";
		
		// Logic here
		for(int i = 0; i < N; i++) {
			int testCaseSum = 0;
			for(int j = 0; j < A[i].length(); j++) {
				if(Character.isDigit(A[i].charAt(j))) {
					testCaseSum += Character.getNumericValue(A[i].charAt(j));
				}
			}
			result += testCaseSum;
			if(i != (N - 1)) {
				result += "\n";
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Input
		String tempStr = "";
		String[] S = {};

		int N = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < N; i++) {
			if (i > 0)
				tempStr += ",";
			tempStr += sc.nextLine();
		}
		sc.close();

		S = tempStr.split(",");

		// System.out.println(Arrays.toString(S));

		// Output
		System.out.print(sumDigits(N, S));

	}

}
