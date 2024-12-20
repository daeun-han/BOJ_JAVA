import java.io.*;

public class Main {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dimensions = br.readLine().split(" ");
        int n = Integer.parseInt(dimensions[0]);
        int m = Integer.parseInt(dimensions[1]);

        board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minPaint = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                minPaint = Math.min(minPaint, calculateRepaints(i, j));
            }
        }

        System.out.println(minPaint);
    }

    private static int calculateRepaints(int x, int y) {
        int repaintW = 0, repaintB = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[x + i][y + j];
                if ((i + j) % 2 == 0) {
                    if (current != 'W') repaintW++;
                    if (current != 'B') repaintB++;
                } else {
                    if (current != 'B') repaintW++;
                    if (current != 'W') repaintB++;
                }
            }
        }

        return Math.min(repaintW, repaintB);
    }
}