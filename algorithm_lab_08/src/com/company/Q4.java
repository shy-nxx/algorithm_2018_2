package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int[] memo = new int[input  + 1];
        System.out.println(minOp2(input, memo));
        System.out.print(input + "->");

//        for (int i = 0; i < memo.length; i++) {
//            System.out.println(memo[i]);
//        }
    }

    public static int minOp(int x) {
        if (x == 1) return 0;

        int min = x + 1; //x가 10일 때 1을 계속 빼주기 때문에 이보다 작을 수 없음.

        if (x % 3 == 0) {
            int ret = minOp(x / 3) + 1;
            min = (min > ret) ? ret : min;
        }
        if (x % 2 == 0) {
            int ret = minOp(x / 2) + 1;
            min = (min > ret) ? ret : min;
        }
        int ret = minOp(x - 1) + 1;

        min = (min > ret) ? ret : min;

        return min;


    }
    //memo 사용
    public static int minOp2(int x, int[] memo) {
        if (x == 1) return 0;

        if (memo[x] != 0) return memo[x];
        int min = x + 1; //x가 10일 때 1을 계속 빼주기 때문에 이보다 작을 수 없음.

        if (x % 3 == 0) {
            System.out.println(x);
            int ret = minOp2(x / 3, memo) + 1;
            min = (min > ret) ? ret : min;

        }
        if (x % 2 == 0) {
            System.out.println(x);
            int ret = minOp2(x / 2, memo) + 1;
            min = (min > ret) ? ret : min;

        }
        int ret = minOp2(x - 1, memo) + 1;

        min = (min > ret) ? ret : min;
        memo[x] = min;
        return min;
    }
    //dp -> 왼 -> 오른쪽으로 돌아야 한다.
    public static int minOp3(int x) {
        int[] dp = new int[x + 1];
        int ret = 0;
        for (int i = 0; i < dp.length; i++) dp[i] = 0;

        for (int i = 2; i <= x; i++) {
            int local_min = x + 1;

        }
        return dp[x];
    }
}
