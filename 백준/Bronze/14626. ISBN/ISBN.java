import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int num = 0;
        int pos = 0;

        for(int i=0; i<n.length(); i++){
            if(n.charAt(i) == '*'){
                pos = i;
            }
            if(n.charAt(i) != '*'){
                if(i % 2 == 0){
                    num += Integer.parseInt(Character.toString(n.charAt(i)));
                }else {
                    num += Integer.parseInt(Character.toString(n.charAt(i)))*3;
                }
            }
        }
        int x = 0;
        for(int i=0; i<=9; i++){
            if(pos % 2 != 0){
                if((num + i*3) % 10 == 0){
                    x = i;
                    break;
                }
            }
            else{
                if((num + i) % 10 == 0){
                    x = i;
                    break;
                }
            }
        }
        
        System.out.println(x);

        sc.close();
    }
}