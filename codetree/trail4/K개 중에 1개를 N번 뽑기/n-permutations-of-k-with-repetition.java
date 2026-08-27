import java.util.Scanner;

public class Main {

    static int k;
    static int n;
    static int[] selected;

    public static void dfs(int depth) {

        if (depth == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            selected[depth] = i;
            dfs(depth + 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        k = sc.nextInt();
        n = sc.nextInt();

        selected = new int[n];

        dfs(0);
    }
}