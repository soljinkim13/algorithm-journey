import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c = arr[6]-a-b;

        System.out.println(a+" "+b+" "+c);
        
        // Please write your code here.
    }
}