import java.util.Scanner;
public class Main {
    public static void star(int n, int cnt){
        if(cnt>n) return;
        for(int i = 0; i<cnt; i++){
            System.out.print("*");
        }
        System.out.println();
        star(n,cnt+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        star(n,1);
        // Please write your code here.
    }
}