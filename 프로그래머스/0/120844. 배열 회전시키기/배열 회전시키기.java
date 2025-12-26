class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int[] tmp = new int[numbers.length];
        
        
        if(direction.equals("left")){
            for(int i=1; i<numbers.length; i++){
                tmp[i-1] = numbers[i];
            }
            tmp[tmp.length-1] = numbers[0];
        }
        if(direction.equals("right")){
            for(int i=0; i<numbers.length-1; i++){
                tmp[i+1] = numbers[i];
            }
            tmp[0] = numbers[numbers.length - 1];
        }
        
        for(int i=0; i<tmp.length; i++){
            answer[i] = tmp[i];
        }
        
        return answer;
    }
}