package algorithm01;

import java.util.Scanner;

public class Student20140179Q1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //01010
		int b = scan.nextInt(); //10110
		Integer[] sum = new Integer[10];
		int carry = 0;
		int i = 0;
		int cnt = 0;
		
		while(a != 0 || b != 0 | carry != 0 ) {
			sum[i++] = (a % 10 + b % 10 + carry) % 2;
			carry = (a % 10 + b % 10 + carry) / 2;
			if (carry == 1) cnt++;
			a = a / 10;
			b = b / 10;
			
		}
		System.out.println(cnt);
	}

}
