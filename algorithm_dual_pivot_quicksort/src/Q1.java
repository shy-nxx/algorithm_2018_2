import java.util.Random;

public class Q1 {
    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private static void quicksort(int[] arr, int lo, int hi) {
        if (hi <= lo)
            return;

        if (arr[hi] < arr[lo])
            swap(arr, lo, hi);

        int lt = lo + 1;
        int gt = hi - 1;
        int i  = lo + 1;

        while (i <= gt) {
            if (arr[i] < arr[lo])
                swap(arr, lt++, i++);
            else if (arr[i] > arr[hi])
                swap(arr, i, gt--);
            else
                i++;
        }

        swap(arr, lo, --lt);
        swap(arr, hi, ++gt);

        quicksort(arr, lo, lt - 1);
        quicksort(arr, lt + 1, gt - 1);
        quicksort(arr, gt+1, hi);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++)
            if(arr[i] > arr[i + 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++) {
            Random r = new Random();
            int len = r.nextInt(999) + 1;
            int[] arr = new int[len];
            for(int j = 0; j < len; j++)
                arr[j] = r.nextInt(300);
            quicksort(arr);
            assert isSorted(arr);
        }
        System.out.println("THE CODE IS ABSOLUTELY CORRECT.");
    }

}
