import java.util.*;

public class Main {

    static int K, N;
    static int[] arr;
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        N = sc.nextInt();

        arr = new int[N];

        dfs(0);
        for (String s : result) {
            System.out.println(s);
        }
    }

    static void dfs(int depth) {
        if (depth == N) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                if (i > 0) sb.append(" ");
                sb.append(arr[i]);
            }

            result.add(sb.toString());
            return;
        }

        for (int i = 1; i <= K; i++) {
            if (depth >= 2
                    && arr[depth - 1] == i
                    && arr[depth - 2] == i) {
                continue;
            }

            arr[depth] = i;
            dfs(depth + 1);
        }
    }
}