import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        // key : 등수, value : 학생 번호
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(int i=0; i<rank.length; i++){
            // 1. true 체크
            if(attendance[i] == true){
                map.put(rank[i], i);
            }
        }
        
        int[] weights = {10000, 100, 1};
        int index = 0;
        
        for(Integer i : map.keySet()){ //저장된 key값 확인
            answer += map.get(i) * weights[index];
            index++;
            if(index == 3)
                break;
        }
        
        return answer;
    }
}