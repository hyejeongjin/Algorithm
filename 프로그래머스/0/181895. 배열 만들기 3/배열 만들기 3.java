class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int count = 0;
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        for(int i=a1; i<arr.length; i++){
            if(i <= b1){
                count++;
            }
        }
        for(int i=a2; i<arr.length; i++){
            if(i <= b2){
                count++;
            }
        }
        answer = new int[count];
        int a = 0;
        
        for(int i=a1; i<arr.length; i++){
            if(i <= b1){
                answer[a++] = arr[i];
            }
        }
        for(int i=a2; i<arr.length; i++){
            if(i <= b2){
                answer[a++] = arr[i];
            }
        }
        
        return answer;
    }
}