class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int n=0; n<arr.length; n++){
                if(s <= n && n <= e){
                    if(n % k == 0){
                        answer[n] = arr[n] + 1;
                    }
                }
            }
        }
        
        return answer;
    }
}