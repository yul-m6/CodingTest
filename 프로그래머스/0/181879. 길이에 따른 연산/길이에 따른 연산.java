class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        
        int len_numList = num_list.length;
        
        if(len_numList >= 11){
            for(int i=0; i<len_numList;i++){
                answer += num_list[i];
            }
            answer = answer - 1;
        }else{
            for(int i=0; i<len_numList;i++){
                answer *= num_list[i];
            }
        }
        
        return answer;
    }
}