import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input_array = new int[8];

        for (int i = 0; i < input_array.length; i++) {
            input_array[i] = scan.nextInt();
        }

        System.out.println(max_sum(input_array, 0, input_array.length-1));
    }
    public static int max_sum(int[] arr, int left, int right) {

        int middle = (left + right) /2;
        if (left == right) return arr[left];
        int max = 0;
        //divid& conquer
        int v1 =  max_sum(arr, left , middle );
        int v2 =  max_sum(arr, middle + 1 , right);

        max = v1>v2 ? v1:v2;

        //중앙값을 기준으로 양옆의 배열의 값들을 더한 후 최댓값을 찾아낸다. (그리고 각각 더함)
        int cv = 0;

        int local_max = arr[middle + 1];

        int local_sum = 0;
        for (int i = middle + 1;i < right; i++) {
            local_sum += arr[i];
            if (local_max < local_sum) local_max = local_sum;

        }
        cv += local_max;

        local_max = arr[middle];
        local_sum = 0;

        for (int i = middle; i >= left; i--) {
            local_sum += arr[i];
            if (local_max < local_sum) local_max = local_sum;

        }
        cv += local_max;
        max = max> cv ? max:cv;

        return max;


    }

}
