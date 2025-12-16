import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = a + b - c;
        String result = Integer.toString(a) + Integer.toString(b);
        result = Integer.toString(Integer.parseInt(result) - c);

        System.out.println(answer);
        System.out.println(result);

    }
}