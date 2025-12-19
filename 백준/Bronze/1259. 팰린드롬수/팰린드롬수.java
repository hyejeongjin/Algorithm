import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 1;

    
        while(true){
            num = sc.nextInt();
            
            if(num == 0)
                break;

            String find = Integer.toString(num);
            boolean result = true;

            for(int i=0; i<find.length()/2; i++){
                if(find.charAt(i) != find.charAt(find.length()-i-1)){
                    result = false;
                    break;
                }
                else{
                    result = true;
                }
            }
            if(result == true){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }

        sc.close();
    }
}