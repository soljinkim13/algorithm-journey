import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        int ans = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
            if(numbers[i]%2==1) odd++;
            else even++;
        }
        
        while(even-odd!=0&& even-odd != 1){
            if(odd>even){
                odd = odd-2;
                even = even+1;
            }else{
                even--;
            }
        }

        ans = even+odd;
        
        System.out.println(ans);

        // Please write your code here.
    }
}