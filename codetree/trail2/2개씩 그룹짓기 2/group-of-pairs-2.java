import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            ans = Math.min(ans,arr[n+i]- arr[i]);
        }
        System.out.println(ans);
    }
}
