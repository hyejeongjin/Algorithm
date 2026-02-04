class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int count = 0;
        
        for(int i=0; i<num_list.length; i+=n){
            count++;
        }
        answer = new int[count];
        int a = 0;
        
        for(int i=0; i<num_list.length; i+=n){
            answer[a++] = num_list[i];
        }
        
        return answer;
    }
}