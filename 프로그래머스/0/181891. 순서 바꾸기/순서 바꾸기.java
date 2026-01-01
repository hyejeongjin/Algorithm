class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int a = 0;
        
        for(int i=n; i<num_list.length; i++){
            answer[a] = num_list[i];
            a++;
        }
        
        int b = num_list.length - n;
        
        for(int j=0; j<n; j++){
            answer[b] = num_list[j];
            b++;
        }
        
        return answer;
    }
}