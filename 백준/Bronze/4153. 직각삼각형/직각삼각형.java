import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] list = new int[3];

    
        while(true){
            for(int i=0; i<list.length; i++){
                list[i] = sc.nextInt();
            }

            if(list[0] == 0 && list[1] == 0 && list[2] == 0)
                break;

            Arrays.sort(list);

            if(Math.pow(list[0], 2) + Math.pow(list[1], 2) == Math.pow(list[2], 2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }

        
        sc.close();
    }
}