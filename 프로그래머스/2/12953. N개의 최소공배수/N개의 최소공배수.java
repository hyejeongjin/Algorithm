class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i=1; i<arr.length; i++){
            answer = getLCM(answer, arr[i]);
        }
        return answer;
        
    }
    private int getGCD(int n, int m){
        while(m != 0){
            int temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }
    private int getLCM(int a, int b){
        return Math.abs(a * b) / getGCD(a, b);
    }
    
}