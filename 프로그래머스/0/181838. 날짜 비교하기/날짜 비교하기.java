class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String strDate1 = "";
        String strDate2 = "";
        int inteDate1 = 0;
        int inteDate2 = 0;
        
        for(int i=0; i<date1.length;i++){
            strDate1+=String.valueOf(date1[i]);
            strDate2+=String.valueOf(date2[i]);
        }
        inteDate1 = Integer.parseInt(strDate1);
        inteDate2 = Integer.parseInt(strDate2);
        
        if(inteDate1 > inteDate2 || inteDate1 == inteDate2){
            answer = 0;
        }else{
            answer = 1;
        }
        
        return answer;
    }
}