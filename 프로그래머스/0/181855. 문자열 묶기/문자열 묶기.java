import java.lang.Math;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[30];
        for(int i=0; i<strArr.length; i++){
            count[strArr[i].length()-1]++;
        }
        for(int i=0; i<count.length; i++){
            answer = Math.max(answer, count[i]);
        }
        
        return answer;
    }
}