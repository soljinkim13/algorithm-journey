import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] left = new int[N];
        int[] right = new int[N];

        for (int i = 0; i < N; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for (int remove = 0; remove < N; remove++) {
            int minLeft = Integer.MAX_VALUE;
            int maxRight = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {

                if (i == remove) {
                    continue;
                }

                minLeft = Math.min(minLeft, left[i]);
                maxRight = Math.max(maxRight, right[i]);
            }

            int length = maxRight - minLeft;

            ans = Math.min(ans, length);
        }

        System.out.println(ans);
    }
}