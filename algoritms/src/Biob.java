package algorithm03;


public class Biob {
    public static final int N = 8;
    public static final int BACKGROUND_COLOR = 0;
    public static final int IMAGE_COLOR = 1;
    public static final int ALREADY_COUNTED = 2;
    public static int count = 0;

    public static void main(String[] args) {
        int[][] biob = {
                {1, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 1, 0, 0, 1, 1, 1}};

        System.out.println(countCells(5, 3, biob));
    }

    public static int countCells(int x, int y, int[][] biob) {
        if (x < 0 || y < 0 || x > N-1 || y > N-1)
            return 0;
        else if (biob[x][y] != IMAGE_COLOR) {
            return 0;
        } else {
            biob[x][y] = ALREADY_COUNTED;
            return 1 + countCells(x, y - 1, biob)
                    + countCells(x + 1, y - 1, biob)
                    + countCells(x + 1, y, biob)
                    + countCells(x + 1, y + 1, biob)
                    + countCells(x, y + 1, biob)
                    + countCells(x - 1, y, biob)
                    + countCells(x - 1, y - 1, biob);

        }
    }

}

