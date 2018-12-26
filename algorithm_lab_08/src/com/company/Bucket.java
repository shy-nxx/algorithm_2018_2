package com.company;

import java.util.Scanner;

public class Bucket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //nums 갯수
        int input_num = scan.nextInt();

        //몇개씩 담을 것인가
        int bucket_num = scan.nextInt();

        //input 숫자들
        int[] inputs = new int[input_num];

        for (int i = 0; i < input_num; i++) {
            inputs[i] = scan.nextInt();
        }

        //정렬
        quicksort(inputs, 0, input_num-1);

        for (int i = 0; i < input_num; i++) {
            System.out.print(inputs[i] + " ");
        }
//
        System.out.println();

        int[] index = new int[input_num-1];

       combination(index, 0,input_num, bucket_num,0, inputs);

    }

    public static void quicksort(int[] arr, int l, int r) {
        if (l < r) {
            int pivot = partition(arr, l, r);

            quicksort(arr, l, pivot-1);
            quicksort(arr, pivot + 1, r);
        }
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = (l + r)/2;

        int left = l;
        int right = r;

        while (left < right) {
            while ((arr[left] < arr[pivot]) && (left < right))
                // L 움직이는 부분
                left++;
            while ((arr[right] >= arr[pivot]) && (left < right))
                // R 움직이는 부분
                right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            if(left == pivot) pivot = right;
            else if(right == pivot) pivot = left;
        }

//        int temp = arr[right];
//        arr[right] = arr[pivot];
//        arr[pivot] = temp;

        return left;


    }
    public static void combination(int[] arr, int index, int n, int r, int target, int[] inputs) {
        if (r == 0) {
            print(arr, index, inputs);
//            for (int i =0; i < index; i++) {
//                arr[i]; // 조합들의 인덱스
//            }
        }
        else if (target == n) return;
        else {
            arr[index] = target;
            combination(arr, index + 1, n, r - 1, target + 1, inputs);
            combination(arr, index, n, r, target + 1, inputs);
        }
    }

    public static void print(int[] arr, int length, int[] inputs) {

        for (int i = 0; i < length; i++) {

            System.out.println(arr[i]);
            for (int j = arr[i]; j <  ; i++) {

            }
            System.out.println()
        }

        System.out.println();

    }


}
