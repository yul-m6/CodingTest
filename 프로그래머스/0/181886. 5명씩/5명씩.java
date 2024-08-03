import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int arrCnt = 0;
        List<String> targetName = new ArrayList<String>();
        
        for(int i=0; i<names.length; i++){
            if(i%5==0){
                arrCnt++;
                targetName.add(names[i]);
            }    
        }
        answer = new String[arrCnt];
        
        for(int i=0; i<targetName.size(); i++){
            answer[i] = targetName.get(i);
        }
        
        return answer;
    }
}