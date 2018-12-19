package algorithm03;

import java.util.Scanner;

public class Handshaking {

	static long cache[];
	public static int getSum(int total, long[] cache) {
		int sum = 0;
		int k;
		if(total==-2) 
			return 1;

		long first, second;
		k=0;
		while(k<=total) {
			if(cache[k] == 0)
				first = getSum(k-2,cache);
			else
				first = cache[k];

			if(cache[total-k] == 0)
				second = getSum(total-k-2,cache);
			else
				second = cache[total-k];

			sum += first*second;

			k+=2;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long cache[];
		cache = new long[n-1];

		System.out.print(getSum(n-2,cache));
	}

}



