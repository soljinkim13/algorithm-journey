import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int light = m*2+1;
        int now = 0;
        while(now<n){
            if(arr[now]==0){
                now++;
            }else{
                ans++;
                now+=light;

            }
        }
            
        System.out.println(ans);
        // Please write your code here.

    
    }
}