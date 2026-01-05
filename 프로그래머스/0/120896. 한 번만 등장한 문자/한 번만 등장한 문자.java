class Solution {
    public String solution(String s) {
        String answer = "";
        
        int[] alpha = new int[26];
        
        for(int i=0; i<alpha.length; i++){
            alpha[i] = 0;
        }
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            alpha[c - 'a']++;
        }
        
        for(int i=0; i<alpha.length; i++){
            if(alpha[i] == 1){
                int num = i + 'a';
                char c = (char) num;
                answer += Character.toString(c);
            }
        }
        
        return answer;
    }
}