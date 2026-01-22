class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int count = 0;
        for(int i=0; i<intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(num > k){
                count++;
            }
        }
        answer = new int[count];
        int a = 0;
        for(int i=0; i<intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(num > k){
                answer[a++] = num;
            }
        }
        
        return answer;
    }
}