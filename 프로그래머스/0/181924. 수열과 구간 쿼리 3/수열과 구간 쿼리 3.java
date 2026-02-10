class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
       
        for(int j=0; j<queries.length; j++){
            int n = queries[j][0];
            int m = queries[j][1];
            int tmp = answer[n];
            answer[n] = answer[m];
            answer[m] = tmp;
        }
        
        return answer;
    }
}