import java.io.IOException;
import java.util.Scanner;

public class Student20140179 {

    static long[] memo = new long[10000001];

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        System.out.println(solve(number));

    }

    static long solve(int num) {
        //입력한 사람의 숫자보다 1만큼 많아야 한다.
        long hand[] = new long[num + 1];

        //루프를 편안하게 돌기 위한 h0=1
        hand[0] = 1;
        //실제 h2=1
        hand[2] = 1;

        for (int i = 4; i <= num; i += 2) {
            long sum = 0;
            for (int j = 0; j < i; j = j + 2) {
                sum += hand[j] * hand[i - j - 2];
            }
            hand[i] = sum;
        }
        return hand[num];
    }

}
