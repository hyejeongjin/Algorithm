import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0; i<arr.length; i++){
            while(dq.size() != 0 && dq.getLast() >= arr[i]){
                dq.removeLast();
            }
            dq.addLast(arr[i]);
        }
        
        stk = dq.stream().mapToInt(Integer::intValue).toArray();
        
        return stk;
    }
}