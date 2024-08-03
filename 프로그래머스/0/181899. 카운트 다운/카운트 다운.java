import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0; i<start_num-end_num+1; i++){
            answer.add(start_num-i);
        }
        
        return answer;
    }
}