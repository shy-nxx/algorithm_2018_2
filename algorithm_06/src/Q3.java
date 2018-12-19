import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {
    private static final int CLOCK_NUM = 16, CNT_BUTTON = 10, MIN = 9999;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] clock = new int[CLOCK_NUM];
        int[] bucket = new int[10];
        int[][] buttons = new int[10][5];


        for (int i = 0; i < 10; i++) {
            int k = scan.nextInt();
            int j = scan.nextInt();
            for (int m = 0; m < j; m++) {
                buttons[k][m] = scan.nextInt();
            }
        }


        for (int i = 0; i < CLOCK_NUM; i++) {
            clock[i] = scan.nextInt();

        }

        System.out.println();
        for (int i = 0; i < CLOCK_NUM; i++) {
            System.out.print(clock[i] + " ");

        }


        int ans = solve(clock,0);

        if (ans < MIN)
            System.out.println(ans);
        else
            System.out.println(-1);


    }

    private static boolean isAllClock12(int[] clockArray) {

        for (int i = 0; i < CLOCK_NUM; i++) {
            if (clockArray[i] != 12) {
                return false;
            }
        }

        return true;
    }

    private static void clickButton(int[] clockArray, int button) {

        for (int clock = 0; clock < button; clock++) {

            clockArray[clock] += 3;
            if (clockArray[clock] >= 15) {
                clockArray[clock] = 3;
            }

        }

    }

    private static int solve(int[] clockArray, int button) {

// 0~9번 버튼에 대해 각각 times번 눌렀을 때, 12시인지 확인.
// 재귀 함수에 대해 헷갈렸던 부분.
// 4^10 완전 탐색을 하므로 10중 for문을 돌린다고 생각하면 좀 더 이해하기 쉽다.
        if (button == 10) {
            return isAllClock12(clockArray) ? 0 : MIN;
        }
        int min = MIN;
// 아래 for문을 재귀 함수로 10중 for문을 만든다고 생각하면 된다.
// clickButton을 재귀 밑에 둠으로써 0번 눌렀을 때도 확인할 수 있으며,
// times가 3일때도 한 번 더 눌러 원상태로 만들어 다음 재귀 함수를 돌린다.
        for (int times = 0; times < 4; times++) {
            min = Math.min(min, times + solve(clockArray, button + 1));
            clickButton(clockArray, button);
        }
        return min;
    }

}

