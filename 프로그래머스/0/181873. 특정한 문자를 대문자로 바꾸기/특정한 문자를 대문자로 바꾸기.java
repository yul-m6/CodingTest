class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
       
        String[] arrString = new String[my_string.length()];
       
        for(int i=0; i<my_string.length();i++){
            arrString[i] = String.valueOf(my_string.charAt(i));
        }
        
        for(int i=0; i<arrString.length;i++){
            if(arrString[i].equals(alp)){
                arrString[i] = arrString[i].toUpperCase();
            }
            answer += arrString[i];
        }
        
        
        return answer;
    }
}