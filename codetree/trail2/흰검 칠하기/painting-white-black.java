import java.util.Scanner;

public class Main {

    static final int MAX = 200005;
    static final int OFFSET = 100000;

    static final int WHITE = 1;
    static final int BLACK = 2;
    static final int GRAY = 3;

    static int[] color = new int[MAX];
    static int[] white = new int[MAX];
    static int[] black = new int[MAX];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pos = OFFSET;

        for (int n = 0; n < N; n++) {

            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {

                for (int i = pos; i >= pos - x + 1; i--) {

                    white[i]++;

                    if (color[i] != GRAY) {

                        if (white[i] >= 2 && black[i] >= 2) {
                            color[i] = GRAY;
                        } else {
                            color[i] = WHITE;
                        }
                    }
                }
                pos -= x - 1;

            } else { // R

                for (int i = pos; i <= pos + x - 1; i++) {

                    black[i]++;

                    if (color[i] != GRAY) {

                        if (white[i] >= 2 && black[i] >= 2) {
                            color[i] = GRAY;
                        } else {
                            color[i] = BLACK;
                        }
                    }
                }
                pos += x - 1;
            }
        }

        int whiteCount = 0;
        int blackCount = 0;
        int grayCount = 0;

        for (int i = 0; i < MAX; i++) {

            if (color[i] == WHITE) {
                whiteCount++;
            } else if (color[i] == BLACK) {
                blackCount++;
            } else if (color[i] == GRAY) {
                grayCount++;
            }
        }

        System.out.println(whiteCount + " " + blackCount + " " + grayCount);
    }
}