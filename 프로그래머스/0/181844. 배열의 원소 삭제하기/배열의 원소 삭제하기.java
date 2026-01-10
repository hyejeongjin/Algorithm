import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            int check = 0;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    check++;
                }
            }
            if(check == 0){
                list.add(arr[i]);
            }
        }
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}