import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input_array = new int[8];

        for (int i = 0; i < input_array.length; i++) {
            input_array[i] = scan.nextInt();
        }

        System.out.println(max_sum(input_array, input_array.length));
    }
    public static int max_sum(int[] arr, int n) {
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            int local_max = arr[i];
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (local_max < sum) local_max = sum;
            }
            if (max < local_max) max = local_max;

        }
        return max;
    }
}
