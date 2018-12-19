package algorithm01;

import java.util.Scanner;

public class Student20140179Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //01010
		int b = scan.nextInt(); //10110
		int[] sum = new int[30];
		
		int[] aToBinary = intToBinary(a);
		int[] bToBinary = intToBinary(b);
		
		int carry = 0;
		int cnt = 0;
		int i = 0;
		int m = 0;
		int k = 0;
		
		while(i < aToBinary.length || m < bToBinary.length | carry != 0 ) {
			
			sum[k++] = (aToBinary[i] + bToBinary[m] + carry) % 2;
			carry = (aToBinary[i] + bToBinary[m] + carry) / 2;
			if (carry == 1) cnt++;
			i++;
			m++;
		}
		
		System.out.println(cnt);
	}
	public static int[] intToBinary (int input) {
		int[] inputToBinary = new int[30];
		int j=0;//배열의 자리수
		int div;//몫
		int div_els;//나머지
		
		while(true){
			div = input/2;
			div_els = input-div*2;//num%2
			inputToBinary[j] = div_els;
			if(div==0){
				break;
			}
			input=div;
			j++;
		}
		return inputToBinary;
		
	}

}
