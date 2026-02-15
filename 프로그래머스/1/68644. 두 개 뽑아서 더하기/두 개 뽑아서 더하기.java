import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        Set<Integer> setList = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<=numbers.length-1; j++){
                setList.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] answer = setList.toArray(new Integer[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}