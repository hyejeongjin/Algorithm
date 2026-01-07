import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = factorial(N) / (factorial(K) * factorial(N-K));
        System.out.println(result);

        sc.close();
    }
    public static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }

}