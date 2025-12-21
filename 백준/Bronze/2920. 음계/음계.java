import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] list = new int[8];

        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }

        String status = "mixed";
        boolean ascSort = true;
        boolean descSort = true;

        for(int j=0; j<list.length - 1; j++){
            if(list[j+1] != list[j] - 1){
                descSort = false;
            }
            if(list[j+1] != list[j]+1){
                ascSort = false;
            }
        }

        if(ascSort == true){
            status = "ascending";
        }
        if(descSort == true){
            status = "descending";
        }
        if(ascSort == false && descSort == false){
            status = "mixed";
        }

         System.out.println(status);

        sc.close();
    }
}