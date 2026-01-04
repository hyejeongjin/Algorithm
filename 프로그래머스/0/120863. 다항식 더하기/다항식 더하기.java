import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] list = polynomial.split(" ");
        List<String> xList = new ArrayList<>();
        
        int number = 0;
        int xNum = 0;
        
        for(int i=0; i<list.length; i++){
            if(!list[i].contains("x") && !list[i].contains("+")){
                number += Integer.parseInt(list[i]);
            }
            if(list[i].contains("x") && !list[i].contains("+")){
                xList.add(list[i]);
            }
        }
        
        for(int i=0; i<xList.size(); i++){
            if(xList.get(i).replace("x", "") == ""){
                xNum += 1;
            }else{
                xNum += Integer.parseInt(xList.get(i).replace("x", ""));
            }
        }
        
        if(number == 0){
            if(xNum == 1){
                answer = "x";
            }else{
                answer = Integer.toString(xNum) + "x";
            }
        }else{
            if(xNum == 0){
                answer = Integer.toString(number);
            }
            else if(xNum == 1){
                answer = "x" + " + " + Integer.toString(number);
            }else{
                answer = Integer.toString(xNum) + "x" + " + " + Integer.toString(number);
            }
        }
        
        return answer;
    }
}