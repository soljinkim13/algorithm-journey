import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int check = n-2;
        int ans = 0;
    
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        while(check>=0&&arr[check]<arr[check+1]){
            check--;
        }
        

        System.out.println(check+1);
        // Please write your code here.
    }
}