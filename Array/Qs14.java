import java.util.Arrays;

public class Qs14 {

    public static int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int[][] result = new int[m][n];

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1, 0};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int sum = 0;
                int count = 0;

                for (int k = 0; k < 9; k++) {
                    int ni = i + dx[k];
                    int nj = j + dy[k];

                    if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                        sum += img[ni][nj];
                        count++;
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] img = {
            {100, 200, 100},
            {200, 50, 200},
            {100, 200, 100}
        };

        int[][] ans = imageSmoother(img);

        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}
