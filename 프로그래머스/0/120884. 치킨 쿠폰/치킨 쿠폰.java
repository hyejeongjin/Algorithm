class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int restCoupon = 0;
        
        while(coupon >= 10){
            restCoupon = coupon / 10 + coupon % 10;
            coupon = coupon / 10;
            answer += coupon;
            coupon = restCoupon;
        }
        return answer;
    }
}