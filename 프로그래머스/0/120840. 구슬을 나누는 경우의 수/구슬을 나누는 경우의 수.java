import java.math.BigInteger;

class Solution {
    static BigInteger big = new BigInteger("1000000");
    public int solution(int balls, int share) {
        int answer = 0;
        
        answer = (factorial(balls).divide(factorial(balls - share).multiply(factorial(share)))).intValue();
        
        return answer;
    }
    
    public static BigInteger factorial(int n) {
        
		if(n <= 1)
            return BigInteger.valueOf(1);
        
        big = BigInteger.valueOf(n).multiply(factorial(n-1));
        
        return big;
	}
}