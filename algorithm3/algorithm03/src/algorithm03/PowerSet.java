package algorithm03;

public class PowerSet {
	//    private static char data[] = {'a','b','c','d','e','f'};
	//    private static int n = data.length;
	//    private static boolean[] include = new boolean[n];
	//    
	//    public static void power(int k) {
	//        if (k == n) {
	//            for (int i = 0; i < n; i++) {
	//                if (include[i]) System.out.println(data[i] + " ");
	//                return;
	//            }
	//        }
	//        include[k] = false;
	//        power(k + 1);
	//        include[k] = true;
	//        power(k + 1);
	//    }
	//    public static void main(String[] args) {
	//    		System.out.println(n);
	//    		power(0);
	//    }
	public static void main(String[] args) {
		powerSet(0,0);
	}

	private static char data[] = {'a','b','c','d'};
	private static int LEVEL = data.length;
	private static char[] subSet = new char[LEVEL];
	private static int count = 0;
	public static void powerSet(int level,int subSetLen ){
		count++;
		System.out.println(count);
		if(level==LEVEL){
			for(int i=0; i<subSetLen; i++)
				System.out.print(subSet[i]+" ");
			System.out.println();
			return;
		}
		powerSet(level+1, subSetLen);
		subSet[subSetLen++] = data[level];
		powerSet(level+1, subSetLen);
	}
}

