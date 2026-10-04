import java.util.Scanner;
public class Main {
    public static void print(int n){
        if (n==0) return;

        print(n-1);
        System.out.print(n+" ");
    }
    public static void printDesc(int n){
        if(n== 0) return;

        System.out.print(n+" ");
        printDesc(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);
        System.out.println();
        printDesc(n);
        // Please write your code here.
    }
}