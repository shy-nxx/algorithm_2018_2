package com.company;

public class Q3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {3, 2, 7, 5, 6, 1, 8, 9, 1, 2, 5, 10};

        int[] memo = new int[arr.length];
        System.out.println(LISDriver3(arr));
    }

    //재귀만 사용
    public static int LIS(int[] arr, int idx) {
        if (idx == 0) return 1;

        int max = 1;
        for (int i = 0; i < idx; i++) {
            if (arr[i] < arr[idx]) {
                int ret = LIS(arr, i) + 1;
                if (max < ret) max = ret;
            }
        }
        return max;
    }

    public static int LISDriver(int[] arr) {
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            int ret = LIS(arr, i);

            if (max < ret) max = ret;
        }
        return max;
    }

    //memo 적용

    public static int LIS2(int[] arr, int[] memo, int idx) {
        if (idx == 0) return 1;

        if (memo[idx] != 0) return memo[idx];

        for (int i = 0; i < memo.length; i++) {
            System.out.println(memo[i]);
        }
        System.out.println("----");
        int max = 1;
        for (int i = 0; i < idx; i++) {
            if (arr[i] < arr[idx]) {
                int ret = LIS2(arr, memo, i) + 1;
                if (max < ret) max = ret;
            }
        }
        memo[idx] = max;
        return memo[idx];
    }

    public static int LISDriver2(int[] arr, int[] memo) {
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            int ret = LIS2(arr, memo, i);
            if (max < ret) max = ret;
        }
        return max;
    }

    //dp적용

    public static int LISDriver3(int[] arr) {
        int[] dp = new int[arr.length];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = 0;
        }
        dp[0] = 1;
        int max = dp[0];

        for (int i = 1; i < arr.length; i++) {
            int local_max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    int ret = dp[j] + 1;
                    if (local_max < ret) local_max = ret;
                }
            }
            dp[i] = local_max;
            if (max < dp[i]) max = dp[i];
        }
        return max;
    }

}
