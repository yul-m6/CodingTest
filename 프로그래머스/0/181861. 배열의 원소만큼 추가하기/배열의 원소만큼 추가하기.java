import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> nums = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i]; j++){
                nums.add(arr[i]);   
            }   
        }
        
        
        int[] answer = new int[nums.size()];
        
        for(int i=0; i<nums.size(); i++){
            answer[i] = nums.get(i);
        }
        
        
        return answer;
    }
}