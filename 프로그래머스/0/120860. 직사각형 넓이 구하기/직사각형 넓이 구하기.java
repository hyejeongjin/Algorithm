import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = -255;
        int minX = 255;
        int maxY = -255;
        int minY = 255;
        
        for(int i=0; i<dots.length; i++){
            maxX = Math.max(maxX, dots[i][0]);
            minX = Math.min(minX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            minY = Math.min(minY, dots[i][1]);
        }
        answer = (maxX - minX) * (maxY - minY);
        return answer;
    }
}