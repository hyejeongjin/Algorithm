import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mul = A * B * C;
        int[] list = new int[10];

        while(mul > 0){
            int n = mul % 10;
            list[n]++;
            mul /= 10;
        }

        for(int i=0; i<10; i++){
            System.out.println(list[i]);
        }

        sc.close();
    }
}