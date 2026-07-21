import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt();
        double ans = num1/num2;
        System.out.printf("%1$d %2$.1f",(num1+num2),(double)(num1+num2)/2);
        // Please write your code here.
    }
}