package algorithm01;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //195
		int n1 = reverse(n); //591
		int cnt = 1;
	
		while(n != n1) {
			int sum = n + n1; 
			if (sum == reverse(sum)) {
				if (cnt > 1000) {
					System.out.println("NaN " + sum );
					return;
				}
				System.out.println(cnt + " " + sum);
				return;
			}
		
			n = sum;
			n1 = reverse(sum);
			cnt++;
		}
	}
	public static int reverse(int n) {
		int n1 = 0;
		
		while(n != 0) {
			n1 = n1 * 10 + n % 10;
			n /= 10;
		}
		
		return n1;
	}
	

}
