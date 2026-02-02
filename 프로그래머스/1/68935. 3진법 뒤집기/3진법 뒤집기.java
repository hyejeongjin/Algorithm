class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(Integer.toString(n, 3));
        String ternary = sb.reverse().toString();
        
        answer = Integer.parseInt(ternary, 3);

        return answer;
    }
}