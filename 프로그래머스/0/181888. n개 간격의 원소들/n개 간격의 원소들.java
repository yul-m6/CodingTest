import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int[] num_list, int n) {
    
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0; i<num_list.length;i+=n){
            answer.add(num_list[i]);
        }
                
        
        return answer;
    }
}