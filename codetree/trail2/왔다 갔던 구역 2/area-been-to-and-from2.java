import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] map = new int[4001];
        int now = 2000;
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir=='L'){
                for(int j = now-1; j>=now-x;j--){
                    map[j]++;
                }
                now-=x;
            }else{
                for(int j = now; j<now+x;j++){
                    map[j]++;
                }
                now+=x;
            }
            // Please write your code here.
        }
        for(int i = 0;i<map.length;i++){
            if(map[i]>1) ans++;
        }
        System.out.print(ans);
    }
}