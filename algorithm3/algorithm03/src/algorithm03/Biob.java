package algorithm03;


public class Biob {
    public static final int N = 8;
    public static final int BACKGROUND_COLOR = 0;
    public static final int IMAGE_COLOR = 1;
    public static final int ALREADY_COUNTED = 2;
    public static int[][] biob = {
            {1, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 1},
            {1, 1, 1, 0, 0, 1, 1, 1}};
    
    public static void main(String[] args) {
        System.out.println(countingCells(5, 3));
    }

    public static int countingCells(int x, int y) {
        if (x < 0 || y < 0 || x > N-1 || y > N-1)
            return 0;
        else if (biob[x][y] != IMAGE_COLOR) {
            return 0;
        } else {
            biob[x][y] = ALREADY_COUNTED;
            return 1  + countingCells(x, y+1) + countingCells(x+1, y+1) + 
					countingCells(x+1, y) + countingCells(x+1, y-1) + 
					countingCells(x, y-1) + countingCells(x-1, y-1) + 
					countingCells(x-1, y) + countingCells(x-1, y+1);
		

        }
    }

}

