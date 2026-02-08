class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int leng = arr.length;
        int target = 1;
        
        while(target < leng){
            target *= 2;
        }
        
        answer = new int[target];
        int a = 0;
        for(int i=0; i<arr.length; i++){
            answer[a++] = arr[i];
        }
        
        return answer;
    }
}