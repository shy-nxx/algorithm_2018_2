package algorithm01;

import java.io.IOException;
import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //123
		int b = scan.nextInt(); //999
		int carry = 0;
		int cnt = 0;
		
		while(a != 0 || b != 0) {
			int s = a % 10; //3
			int t = b % 10; //9
			
			carry = (s + t + carry) / 10; //12 / 10 -> 1
			
			if (carry == 1) cnt++;
			
			a = a / 10; //12
			b = b / 10; //99
	
		}
		System.out.println(cnt);
	}
}
