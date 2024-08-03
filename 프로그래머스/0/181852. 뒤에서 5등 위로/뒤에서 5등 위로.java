import java.util.*;

class Solution {
    public List solution(int[] num_list) {
    
        List<Integer> answer = new ArrayList<Integer>();
        Arrays.sort(num_list); 
        
        for(int i=0; i<num_list.length; i++){
            if(i>4){
                answer.add(num_list[i]);
            }
        }
        
        return answer;
    }
}