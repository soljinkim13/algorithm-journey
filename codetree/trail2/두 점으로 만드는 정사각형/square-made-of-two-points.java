import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        
        int ansX2 = Math.max(x2,a2);
        int ansX1 = Math.min(x1,a1);
        int ansY2 = Math.max(y2,b2);
        int ansY1 = Math.min(y1,b1);

        int size = Math.max(ansX2-ansX1,ansY2-ansY1);
        System.out.println(size*size);
        // Please write your code here.
    }
}