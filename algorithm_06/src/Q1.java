public class Q1 {
    //dynamic programming 부하직원이 없는 사람 -> 부하직원이 1명 -> 부하직원이 2명.. 의 순서로 작업한다.
    //sort가 먼저 수행되어야 한다. (오름차순)

    static String[] organization = {
            "NYYNN",
            "NNNNN",
            "NNNYY",
            "NYNNN",
            "NNNNN"
    };
    public static void main(String[] args) {
        int[] bucket = new int[organization.length];
        System.out.println(findAllSalary());
    }
    static int findAllSalary(int n, int[] bucket) {
        System.out.println("n" + n);
        if(bucket[n] != 0) return bucket[n];
        int ret = 0;
        char p[] = organization[n].toCharArray();

        for (int i = 0; i < p.length; i++) {
            if (i != n && p[i] == 'Y') {
                ret = ret + findAllSalary(i, bucket);
            }
        }
        ret = ret == 0?1:ret;
        bucket[n] = ret;

        return ret;
    }
    static int findAllSalary() {
        int[] bucket = new int[organization.length];

        int total = 0;

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }
        //급여가 0일 수는 없지만 0으로 초기화한다.
        for (int i = 0; i < organization.length; i++ ){
            total = total + findAllSalary(i, bucket);
        }
        return total;

    }


}
