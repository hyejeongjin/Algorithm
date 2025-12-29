import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] list = myStr.split("[a-c]");
        int count = 0;
        List<String> myList = new ArrayList<>();
        
        for(int i=0; i<list.length; i++){
            if(list[i].length() != 0){
                count++;
            }
        }
        
        String[] answer = new String[count];
        
        for(int i=0; i<list.length; i++){
            if(list[i].length() != 0){
                myList.add(list[i]);
            } 
        }   
        
        for(int i=0; i<myList.size(); i++){
            answer[i] = myList.get(i);
        }        
        
        if(answer.length == 0){
            answer = new String[1];
            answer[0] = "EMPTY";
        } 
        
        return answer;
    }
}