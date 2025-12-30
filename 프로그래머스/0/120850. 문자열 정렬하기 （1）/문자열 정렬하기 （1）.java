import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) > 47 && my_string.charAt(i) < 58){
                count++;
            }
        }
        
        int[] answer = new int[count];
        int a = 0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) > 47 && my_string.charAt(i) < 58){
                int num = my_string.charAt(i) - '0';
                answer[a] = num;
                a++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}