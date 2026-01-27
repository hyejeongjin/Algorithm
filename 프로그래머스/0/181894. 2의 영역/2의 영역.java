import java.lang.Math;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = 1000001;
        int max = 0;
        boolean hasTwo = false;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                min = Math.min(min, i);
                max = Math.max(max, i);
                hasTwo = true;
            }
        }

        int a = 0;
        if(hasTwo == false){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[max - min + 1];
            for(int i=min; i<=max; i++){
                answer[a] = arr[i];
                a++;
            }
        }
        
        return answer;
    }
}