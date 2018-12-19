package algorithm03;

import java.util.Scanner;

public class Q1 {
	static double east;
	static double west;
	static double south;
	static double north;
	static int map[][] = new int[21][21];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nums = scan.nextInt();

		east = scan.nextDouble();
		west = scan.nextDouble();
		south = scan.nextDouble();
		north = scan.nextDouble();

		int x = 10;
		int y = 10;

		double result = visit(x, y, nums) / 100;
		System.out.println(result);

	}
	public static double visit(int x, int y, int n) {

		if (map[x][y] == 1) {return 0;} //non-promising
		if (n == 0) {
			System.out.println("n == 0");
			return 1;
		}
		map[x][y] = 1;
		
		double ret = visit(x + 1, y, n -1) * east;
		ret = ret + visit(x -1, y, n -1) * west;
		ret = ret + visit(x, y +1, n -1) * south;
		ret = ret + visit(x, y - 1, n -1) * north;
		
		map[x][y] = 0; //열칸을 간 다음에 다시 좌표를 초기화 해주는 부분 (color를 풀어준다.)
		
		return ret;

	}
}
