package com.company;

import static com.company.Q1.find_memo;

//dp���� Ǯ��
public class Q2 {
	static int[][] map = {
			{2,5,1,6,1,3,1},
			{6,7,1,2,4,3,7},
			{7,2,3,2,1,3,2},
			{2,5,3,1,8,1,4},
			{3,1,2,3,4,2,2},
			{2,2,3,4,1,2,1},
			{1,9,5,2,8,7,0}
	};
	
	static int[][] memo;
	//-1�� �ʱ�ȭ-> ����� �ȵǾ��ִ� ��� 
	//0�� ���� ����
	//1�� ���� ���� 
	//����� �ȵǾ��մ� ���, ����� �ߴµ� ���� ���� ���, ����� �ߴµ� ���� �մ� ��� 
	public static boolean find_dp(int x, int y) {
		if (x >= map.length ) return false;
		if (y >= map.length )return false;
		
		if (memo[x][y] != -1) return memo[x][y] == 1;
		//�޸��� �����ϸ� 1�� ���� 
		if (x == map.length -1 && y == map.length -1) return true;
		memo[x][y] = 0;
//		if (find(x + map[x][y], y)) return true;
//		if (find(x, y + map[x][y])) return true;
//		
		if (find_memo(x + map[x][y], y)) memo[x][y] = 1;
		if (find_memo(x, y + map[x][y])) memo[x][y] = 1;
		return memo[x][y] == 1;
	}
	public static void main(String[] args) {
		memo = new int[map.length][map.length];
		for (int i = 0; i < map.length; i++)
			for (int j = 0; j < map.length; j++) 
				memo[i][j] = -1;
			
		System.out.println(find_memo(0,0));
	}
} 
