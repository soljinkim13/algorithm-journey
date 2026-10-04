import java.util.Scanner;
public class Main {
    public static int n;
    public static int ans;

    public static void cal(int cnt){
        if(n==cnt){
            ans++;
            return;
        }
        for(int i = 1; i<=4;i++){
            if(cnt+i<=n) cal(cnt+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = 0;
        cal(0);
        System.out.println(ans);
        
        // Please write your code here.

        
    }
}