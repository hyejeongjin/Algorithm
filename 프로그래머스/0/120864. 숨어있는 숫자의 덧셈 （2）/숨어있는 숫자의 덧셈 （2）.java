class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String digit = "";
        
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c)){
                digit += Character.toString(c);
            }
            else if(!Character.isDigit(c) && digit != ""){
                answer += Integer.parseInt(digit);
                digit = "";
            }
        }
        if(digit != ""){
            answer += Integer.parseInt(digit);
        }
        
        
        return answer;
    }
}