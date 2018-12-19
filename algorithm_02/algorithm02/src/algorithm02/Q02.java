package algorithm02;

import java.util.Scanner;

public class Q02 {
	public static int[][] cards = {
			{1,2,3,4,5,6,7,8},
			{1,2,3,4,9,10,11,12},
			{1,2,5,6,9,10,13,14},
			{1,3,5,7,9,11,13,15}
	};
	
	public static String[] cards_toString= {
			"YYYY",
			"YYYN",
			"YYNY",
			"YYNN",
			"YNYY",
			"YNYN",
			"YNNY",
			"YNNN",
			"NYYY",
			"NYYN",
			"NYNY",
			"NYNN",
			"NNYY",
			"NNYN",
			"NNNY",
			"NNNN"
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String answer = scan.nextLine();
		
		for (int i = 0; i < cards_toString.length; i++) {
			if (answer.equals(cards_toString[i])) {
				System.out.println(i+1);
			}
		}
		
	}

}
