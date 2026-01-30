class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string.substring(s, e+1));
        String reverse = sb.reverse().toString();
        String change = my_string.substring(s, e+1);
        answer = my_string.replace(change, reverse);
        
        return answer;
    }
}