class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<number.length(); i++){
            sum += Integer.parseInt(number.substring(i, i+1));    
        }
        
        answer = sum % 9;
        
        return answer;
    }
}