import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
            sum += blocks[i];
        }

        int av = sum/n;
        int ans = 0;
        for(int i = 0; i< n; i++){
            if(blocks[i]>av) ans +=(blocks[i]-av);
        }

        System.out.println(ans);
        // Please write your code here.
    }
}