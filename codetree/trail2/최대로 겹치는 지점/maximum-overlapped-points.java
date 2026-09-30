import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] map = new int[101];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a-1; j<=b-1;j++){
                map[j]++;
            }
        }
        Arrays.sort(map);
        System.out.print(map[map.length-1]);
        // Please write your code here.
    }
}