import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : array){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        int max = 0;
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                answer = entry.getKey();
                count = 1;
            }else if(entry.getValue() == max){
                count++;
            }
        }
        if(count >= 2)
            answer = -1;
        
        return answer;
    }
}