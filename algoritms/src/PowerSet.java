public class PowerSet {
//    private static char data[] = {'a', 'b', 'c', 'd', 'e', 'f'};
//    private static int n = data.length;
//    private static boolean[] include = new boolean[n];

    //    public static void power(int k) {
//        if (k == n) {
//            for (int i = 0; i < n; i++) {
//                if (include) System.out.println(data[i] + " ");
//                System.out.println();
//                return;
//            }
//        }
//        include[k] = false;
//        power(k + 1);
//        include[k] = true;
//        power(k + 1);
//    }
    public static void main(String[] args) {
        powerSet(0, 0);
    }

    private static int[] set = {1, 5, 3, 4};
    private static int LEVEL = set.length;
    private static int[] subSet = new int[LEVEL];

    public static void powerSet(int level, int subSetLen) {
        if (level == LEVEL) {
            for (int i = 0; i < subSetLen; i++)
                System.out.print(subSet[i] + " ");
            System.out.println();
            return;
        }
        powerSet(level + 1, subSetLen);
        subSet[subSetLen++] = set[level];
        powerSet(level + 1, subSetLen);
    }
}
