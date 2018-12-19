import java.util.Scanner;

public class sorting1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        //selection sort

//        for (int i = 0; i < n-1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[j] < nums[i]) {
//                    int temp = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = temp;
//                }
//
//            }
//        }

        //insertion sort
//        for (int i = 1; i < n; i++) {
//            int index = i - 1;
//            int key = nums[i];
//            while(index >= 0 && key < nums[index] ) {
//                nums[index + 1] = nums[index];
//                index--;
//            }
//            nums[index + 1] = key;
//        }

        //mergesort
        mergeSort(nums, 0, n-1);

        //정렬된 배열 출력
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }


    }
    public static void mergeSort(int[] arr, int m, int n) {
        int mid;

        if (m < n) {
            mid = (m + n) /2;

            mergeSort(arr, m, mid);
            mergeSort(arr, mid+1, n);
            merge(arr, m, mid, n);
        }
    }
    public static void merge(int[] arr, int m, int mid, int n) {
        int i, j, k , h;


    }
}
