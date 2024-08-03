class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str = String.valueOf(a) + String.valueOf(b);
        int integer = Integer.parseInt(str);
        int multiply = 2 * a * b;
        
        if(integer > multiply){
            answer = integer;
        }else if(integer < multiply){
            answer = multiply;
        }else{
            answer = integer;
        }
        
        return answer;
    }
}