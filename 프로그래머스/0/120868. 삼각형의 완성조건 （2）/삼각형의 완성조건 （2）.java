import java.lang.Math;
import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1];
            
        for(int i=0; i<sides[1]; i++){
            if(sides[0] + i > max){
                answer++;
            }
        }
        
        for(int i=sides[1]; i<sides[0] + sides[1]; i++){
            if(sides[0] + sides[1] > i){
                answer++;
            }
        }
        
        return answer;
    }
}