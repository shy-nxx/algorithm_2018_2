package algorithm02;

import java.util.Scanner;

public class Student20140179 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();

		float left_num = 0, left_deno = 1;
		float mid_num = 1, mid_deno = 1;
		float right_num = 1, right_deno = 0;
		
		while (true) {
			float temp_num = mid_num;
			float temp_deno = mid_deno;

			if ((num1 / num2) > (mid_num / mid_deno)) {
				System.out.print("R");
				mid_num = mid_num + right_num;
				mid_deno = mid_deno + right_deno;
				left_deno = temp_deno;
				left_num = temp_num;

			}
			else if ((num1 / num2) < (mid_num / mid_deno)) {
				System.out.print("L");
				mid_num = mid_num + left_num;
				mid_deno = mid_deno + left_deno;
				right_deno = temp_deno;
				right_num = temp_num;
			}
			else if ((num1 / num2) == (mid_num / mid_deno)) {
				break;
			}
		}
	}
}
