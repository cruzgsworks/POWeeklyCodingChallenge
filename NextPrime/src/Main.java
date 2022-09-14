
public class Main {
	/*
	 * PO Weekly Coding Coding Challenge 9/12/2022 - 9/16/2022
	 */

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int NextPrime(int N) {
		int result = 0;
		if(isPrime(N)) {
			result = N;
		} else {
			int inc = N;
			while(true) {
				inc++;
				if(isPrime(inc)) {
					result = inc;
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NextPrime(12));
		System.out.println(NextPrime(24));
		System.out.println(NextPrime(11));
	}

}
