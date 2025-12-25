import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] list = myString.split("x");
        
        int count = 0;
        
        for(int i=0; i<list.length; i++){
            if(!list[i].equals("")){
                count++;
            }
        }
        
        String[] answer = new String[count];
        int k = 0;

        for(int i=0; i<list.length; i++){                
            if(!list[i].equals("")){
                answer[k] = list[i];
                k++;
            }
        }
        
        Arrays.sort(answer);
        
        
        return answer;
    }
}