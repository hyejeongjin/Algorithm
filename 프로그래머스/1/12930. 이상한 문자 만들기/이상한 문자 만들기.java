import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(Character.isWhitespace(c)){
                sb.append(c);
                idx = 0;
            }
            else{
                if(idx % 2 == 0){
                    sb.append(Character.toString(c).toUpperCase());
                }else{
                    sb.append(Character.toString(c).toLowerCase());
                }
                idx++;
            }
        }
        
        return sb.toString();
    }
}