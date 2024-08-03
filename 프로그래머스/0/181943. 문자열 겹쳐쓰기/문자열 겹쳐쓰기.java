class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int length1 = overwrite_string.length();
        int length2 = my_string.length();

        
        answer = my_string.substring(0,s) + overwrite_string+ my_string.substring(s+length1,length2);
        return answer;
    }
}