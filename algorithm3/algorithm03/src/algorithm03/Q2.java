package algorithm03;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt(); //7

		int[] items= {-1,+1};

		int n = 1;
		while(sumN(n) < input) {
			n++;
		}

		while(true) {
			int[] bucket = new int[n];
			boolean ret = solution(items, bucket, n, input);
			if (ret) break;
			n++;
		}


	}
	public static int sumN(int n) {
		return n * (n+1)/2;
	}
	public static boolean solution(int[] items, int[] bucket, int k, int input) 
	{

		if (k == 0) {
			int result = 0;

			for (int i = 0; i < bucket.length; i++) {
				result += bucket[i] * (i+1);
			}

			if (result == input) {
				for (int i = 0; i < bucket.length; i++) {
					if (bucket[i] == 1) 
						System.out.print("+");
					else
						System.out.print("-");
					System.out.print(i + 1);
				}
				System.out.println();
				return true;
			}
			return false;
		}

		int lastIndex = bucket.length - k - 1;
		boolean ret = false;
		for (int i = 0; i < items.length; i++) {
			bucket[lastIndex + 1] = items[i];
			ret = solution(items, bucket, k-1, input) || ret;
		}
		return ret;

	}

}
