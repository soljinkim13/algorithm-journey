import java.util.*;

public class Main {

    static int N, M, K;
    static int[] move;
    static int[] horse;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        move = new int[N];

        for (int i = 0; i < N; i++) {
            move[i] = sc.nextInt();
        }

        horse = new int[K];
        Arrays.fill(horse, 1);

        dfs(0);

        System.out.println(answer);
    }

    static void dfs(int turn) {
        if (turn == N) {

            int score = 0;

            for (int i = 0; i < K; i++) {
                if (horse[i] >= M) {
                    score++;
                }
            }

            answer = Math.max(answer, score);
            return;
        }

        for (int i = 0; i < K; i++) {
            if (horse[i] >= M) {
                dfs(turn + 1);
                continue;
            }

            horse[i] += move[turn];
            dfs(turn + 1);
            horse[i] -= move[turn];
        }
    }
}