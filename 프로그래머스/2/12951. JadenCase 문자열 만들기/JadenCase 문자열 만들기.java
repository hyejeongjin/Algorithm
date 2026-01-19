class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        
        for(int i=0; i<s.length(); i++){
            if(i > 0 && sb.charAt(i-1) == ' '){
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }else if(sb.charAt(0) > 57){
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            }else{
                sb.setCharAt(i, sb.charAt(i));
            }
        }
        
        return sb.toString();
    }
}