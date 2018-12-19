package algorithm02;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int input = 0;
		int[] temp = new int[n];
		int max = 0;
		
		for(int i = 0; i< n; i++) {
			input = scan.nextInt();
			temp[i] = input;
		}
		
		max = getEncodedNumber(temp);
		System.out.println(max);
	}
	public static int getEncodedNumber(int arr[]) {
		int max = 1;
		int min_idx = 0;
		
		for(int i = 0; i< arr.length; i++) {
			if (arr[min_idx] > arr[i]) { 
				//증가율식 = n+1 / n 이기 때문에 n이 작은 수일 수록 유리하다. 따라서 n이 가장 작은 arra의 원소를 찾는 식이 필요 
				min_idx = i;
			}
		}
		arr[min_idx]++;
		
		for(int i = 0; i < arr.length; i++) {
			max = max * arr[i];
			
		}
		return max;
	}
}
