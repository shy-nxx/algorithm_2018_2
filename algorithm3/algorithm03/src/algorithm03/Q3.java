package algorithm03;

import java.io.IOException;
import java.util.Scanner;

public class Q3 {

	static long[] memo = new long[10000001];

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		
		System.out.println(solve(number));
		
	}
	static long solve(int num) {

        if (num == 0) {
            return 1;
        }

        if (num == 2) {
            return memo[2] = 1;
        }

        if (num % 2 != 0) {
        		return 0;
        }
        
        if (memo[num] > 0) {

            return memo[num];
        }

        long ret = 0;

        for (int i = 1; i < num; i += 2) {

            ret += solve(i - 1) * solve(num - (i + 1));
            
        }

        return memo[num] = ret;
    }

}
