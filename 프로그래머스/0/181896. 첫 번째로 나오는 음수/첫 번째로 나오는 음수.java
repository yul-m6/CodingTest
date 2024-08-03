class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int isNegative = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] < 0 && isNegative == 0){
                answer = i;
                isNegative++;
            }else if(num_list[i] > 0 && isNegative == 0) {
                answer = -1;
            }   
        }
        return answer;
    }
}