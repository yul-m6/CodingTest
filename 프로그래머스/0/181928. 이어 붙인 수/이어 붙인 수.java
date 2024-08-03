class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenNumber = "";
        String oddNumber = "";
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                evenNumber += num_list[i];
            }else{
                oddNumber += num_list[i];
            }
        }
        
        answer = Integer.parseInt(evenNumber)+Integer.parseInt(oddNumber);
        
        return answer;
    }
}