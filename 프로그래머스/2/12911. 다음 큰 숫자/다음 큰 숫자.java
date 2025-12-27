class Solution {
    public int solution(int n) {
        int answer = 0;
        String curNum = Integer.toBinaryString(n);
        int current = countBinary(curNum);
        
        
        while(true){
            n+=1;
            String nextNum = Integer.toBinaryString(n);
            int next = countBinary(nextNum);
            if(current == next){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
    
    private int countBinary(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}