import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int answer = 0;

        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }

        for(int j=0; j<list.length; j++){
            sum += list[j]*list[j];
        }

        answer = sum % 10;
        System.out.println(answer);
    }
}