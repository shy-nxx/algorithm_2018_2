import java.util.Scanner;
import java.util.StringTokenizer;

public class Student20140179 {
    static int minValue = Integer.MAX_VALUE;
    static int[] bucket = new int[10];
    private static final int CLOCK_NUM = 16, CNT_BUTTON = 10, MIN = 9999;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] clock = new int[CLOCK_NUM];
        int[][] buttons = new int[10][6];


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


        solve(buttons,clock,0,0);

        if (minValue == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(minValue);
        }


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

    private static void solve(int[][] buttons,int[] clock ,int button, int countOfPressBtn) {

        if (button == 10) {
            int[] temp = new int[16];
            for (int i = 0; i < bucket.length; i++) {
                for (int j = 0; j < buttons[i].length; j++) {
                    if (j > 0 && buttons[i][j] == 0)
                        break;
                    temp[buttons[i][j]] += 3 * bucket[i];
                }
            }

            boolean b = true;
            for (int i = 0; i < clock.length; i++) {
                if (((temp[i] + clock[i]) % 12) != 0) {
                    b = false;
                    break;
                }
            }

            if (b) {
                if (minValue > countOfPressBtn) {
                    minValue = countOfPressBtn;
                }
            }

            return;
        }

        for (int i = 0; i < 4; i++) {
            bucket[button] = i;
            solve(buttons, clock, button + 1, countOfPressBtn + i);
        }

    }

}

