import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = getGCD(a, b);
        int lcm = gcd * (a/gcd) * (b/gcd);

        System.out.println(gcd);
        System.out.println(lcm);

        sc.close();
    }

    public static int getGCD(int n, int m){
        
        while(m != 0){
            int temp = n % m;
            n = m;
            m = temp;
        }
        
        return n;
    }

}