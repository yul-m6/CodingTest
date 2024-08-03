import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArr = new char[a.length()];
        String answer = "";
        
        for(int i=0; i<charArr.length; i++){
            charArr[i] = a.charAt(i);
        }
        
        for(int i=0; i<charArr.length; i++){
            if(Character.isUpperCase(charArr[i])){
                charArr[i] = Character.toLowerCase(charArr[i]);
            }else{
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        
        for(int i=0; i<charArr.length; i++){
            answer += String.valueOf(charArr[i]);
        }
        System.out.println(answer);
        
    }
}