class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            boolean delete = false;
            for(int j=0; j<indices.length; j++){ 
                if(i == indices[j]){
                    delete = true;
                }
            }
            if(delete == false){
                answer += my_string.charAt(i);
            }
        }        
        return answer;
    }
}