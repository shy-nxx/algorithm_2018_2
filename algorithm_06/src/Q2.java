import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] changes = {10, 50, 100};
        int bucket_size = input / 10;
        int[] bucket = new int[bucket_size];
        System.out.println(findMethodsChanges(input, changes, bucket, bucket_size));

    }

    static int findMethodsChanges(int total, int[] changes, int[] bucket, int k) {
        int last_idx = bucket.length - k - 1;
        int sum = 0;

        for (int i = 0; i <= last_idx; i++) {
            sum += bucket[i];
        }

        if (sum == total) {
            for (int i= 0 ; i <= last_idx; i++) {
                System.out.println(bucket[i] + " ");
            }
            System.out.println();
            return 1;
        }
        //bucket_size
        if (k == 0) return 0;

        int count = 0;

        for (int i = 0; i < changes.length; i++) {
            if (last_idx == -1 || bucket[last_idx] <= changes[i]) {
                bucket[last_idx +1] = changes[i];
                count += findMethodsChanges(total, changes, bucket, k-1);
            }
        }
        return count;
    }
}
