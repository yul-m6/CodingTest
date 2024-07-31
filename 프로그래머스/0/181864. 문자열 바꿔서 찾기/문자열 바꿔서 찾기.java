class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String replaceString = myString.replace("A", "1").replace("B", "2");
        replaceString = replaceString.replace("1", "B").replace("2", "A");
        if(replaceString.contains(pat)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}