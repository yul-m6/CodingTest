class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] strArr = new String[myString.length()];
        
        for(int i=0; i<myString.length(); i++){
            strArr[i] = myString.substring(i, i+1);
        }
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].compareTo("l") > 0){
                answer += strArr[i];
            }else{
                answer += "l";
            }
        }
        
        return answer;
    }
}