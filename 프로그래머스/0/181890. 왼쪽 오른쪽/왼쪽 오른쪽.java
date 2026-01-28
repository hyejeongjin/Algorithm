class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int count = 0;
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                for(int j=0; j<i; j++){
                    count++;
                }
                break;
            }else if(str_list[i].equals("r")){
                for(int j=i+1; j<str_list.length; j++){
                    count++;
                }
                break;
            }else{
                
            }
        }
        answer = new String[count];
        int a = 0;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                for(int j=0; j<i; j++){
                    answer[a++] = str_list[j];
                }
                break;
            }else if(str_list[i].equals("r")){
                for(int j=i+1; j<str_list.length; j++){
                    answer[a++] = str_list[j];
                }
                break;
            }
        }
        
        return answer;
    }
}