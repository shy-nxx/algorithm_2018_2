import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14890 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        String line = reader.readLine();
        StringTokenizer st = new StringTokenizer(line);

        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(reader.readLine());
        }

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < N; j++) {
                while(!st.hasMoreTokens()) {
                    st = new StringTokenizer(reader.readLine());
                }
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ret = solution(matrix, N, L);

        for (int i = 0; i < N; i++) {
            for (int j = i;  j < N; j++ ) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        System.out.println(ret + solution(matrix, N, L));

    }
    public static int solution(int[][] matrix, int N, int L) {
        int ret = 0;
        for (int i = 0; i < N; i++) {
            int prev_h = matrix[i][0];
            int prev_c = 1;
            boolean flag = true;
            for (int j = 1; j < N; j++) {
                if (prev_h == matrix[i][j]) {
                    prev_c += 1;
                }
                else {
                    if (prev_h + 1 < matrix[i][j] || prev_h -1 > matrix[i][j]) {
                        flag =false;
                        break;
                    }
                    if (prev_h + 1 == matrix[i][j]) {
                        if (prev_c < L ) {
                            flag = false;
                            break;
                        }
                        prev_h = matrix[i][j];
                        prev_c = 1;

                    }
                    else {
                        int t_cnt = 0;
                        int t_h = matrix[i][j];
                        for (; j < N; j++) {
                            if (t_h != matrix[i][j]) break;
                            t_cnt++;
                            if (t_cnt == L) break;
                        }
                        if (t_cnt == L) {
                            prev_h = matrix[i][j];
                            prev_c = 0;
                            continue;
                        }
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) ret++;

        }
        return ret;
    }
}
