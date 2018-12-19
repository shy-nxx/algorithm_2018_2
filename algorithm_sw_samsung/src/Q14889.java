public class Q14889 {
    public static void main(String[] args) {
        int n = 6;

        int[] players = new int[n];

        for (int i = 0; i < n; i++) {
            players[i] = i;
        }

        int[] bucket = new int[n / 2];
        bucket[0] = 0;

        solution(players, bucket, n / 2 - 1);
    }

    public static void solution(int[] items, int[] buckets, int k) {

        if (k == 0) {
            int[] oppTeam = new int[buckets.length];

            int i = 0;
            int j = 0;
            int l = 0;

            for (i = 0; i < items.length; i++) {
                if (j < buckets.length && items[i] < buckets[j]) {
                    oppTeam[l++] = items[i];
                } else if (j == buckets.length) {
                    oppTeam[l++] = items[i];
                } else j++;
            }
            System.out.print("[");
            for (i = 0; i < buckets.length; i++) {
                System.out.print(buckets[i] + " ");
            }
            System.out.print("]");
            System.out.print("[");
            for (i = 0; i < oppTeam.length; i++) {
                System.out.print(oppTeam[i] + " ");
            }
            System.out.print("]");
            return;

        }

        int lastIndex = buckets.length - k - 1;

        for (int i = 0; i < items.length; i++) {
            if (lastIndex == -1) {
                buckets[lastIndex + 1] = i;
            } else if (buckets[lastIndex] < items[i]) {
                buckets[lastIndex + 1] = i;
            } else continue;

            solution(items, buckets, k - 1);
        }


    }
}
