import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static String secondMaximum(int N, String[] S) {
		String result = "";

		// Logic goes here
		for (int i = 0; i < N; i++) {
			String[] splitArr = S[i].split(" ");
			int[] numArr = new int[splitArr.length];
			for (int j = 0; j < splitArr.length; j++) {
				numArr[j] = Integer.parseInt(splitArr[j]);
			}
			Arrays.sort(numArr);
			result += numArr[1];
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

		System.out.println(Arrays.toString(S));

		// Output
		System.out.print(secondMaximum(N, S));
	}

}
