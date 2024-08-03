class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        
        String str1 = my_string.substring(s,e+1);
        String str2 = "";
        
    	for(int i=str1.length()-1; i>=0; i--) {
    		str2 += str1.charAt(i);
    	}
    	answer = my_string.replace(str1,str2);
        
        return answer;
    }
}