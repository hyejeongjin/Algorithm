import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0; i<arr.length;i++){
            if(dq.size() == 0){
                dq.addLast(arr[i]);
            }
            else if(dq.getLast() == arr[i]){
                dq.removeLast();
            }
            else if(dq.getLast() != arr[i]){
                dq.add(arr[i]);
            }
        }
        
        if(dq.size() == 0){
            dq.add(-1);
        }
        
        answer = dq.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}