import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] map = new int[202];
        for (int e = 0; e < n; e++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a+=101;
            b+=101;
            for(int i = a-1; i<b-1;i++){
                map[i]++;
        }
        // Please write your code here.
    }
    Arrays.sort(map);
    System.out.println(map[201]);
    }
}