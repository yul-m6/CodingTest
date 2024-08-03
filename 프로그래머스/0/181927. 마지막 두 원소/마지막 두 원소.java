import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<Integer>();
        
        
        for(int i=0; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        if(answer.get(answer.size()-1) > answer.get(answer.size()-2)){
            answer.add(answer.get(answer.size()-1) - answer.get(answer.size()-2));
        }else{
            answer.add((answer.get(answer.size()-1)) * 2);
        } 
        
        
        
        
        return answer;
    }
}