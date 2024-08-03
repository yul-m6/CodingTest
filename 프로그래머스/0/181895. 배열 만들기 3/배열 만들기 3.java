import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        
        List<Integer> numArr = new ArrayList<Integer>();
        
        for(int i = 0; i < intervals.length; i++) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                numArr.add(arr[j]);
            }
        }
        
        int[] answer = new int[numArr.size()];
        
        for(int i=0; i<numArr.size(); i++){
            answer[i] = numArr.get(i);
        }
        
        
        return answer;
    }
}