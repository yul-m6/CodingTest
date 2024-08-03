class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] strArr = binomial.split(" ");
        int num1 = Integer.parseInt(strArr[0]);
        String op = strArr[1];
        int num2 = Integer.parseInt(strArr[2]);
        
        if(op.equals("+")){
            answer = num1 + num2;
        }else if(op.equals("-")){
            answer = num1 - num2;
        }else if(op.equals("*")){
            answer = num1 * num2;
        }
        
        return answer;
    }
}