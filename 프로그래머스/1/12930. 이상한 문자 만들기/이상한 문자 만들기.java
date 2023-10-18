import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Solution {
 public static String solution(String s){
        String answer ="";
        int cnt =0;


       String[] word=s.split(" ");
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') {
                cnt++;
            }else {
                break;
            }
        }


       for(int i =0; i<word.length;i++) {
           System.out.println(word.length);
           char[] ch=word[i].toCharArray();
            for (int j = 0; j < ch.length; j++){
                if(j%2==0){
                    ch[j]=Character.toUpperCase(ch[j]);
                }else
                    ch[j]=Character.toLowerCase(ch[j]);
            }
            word[i]=new String(ch);
           if(i == word.length-1) {
               answer += word[i];
           }
           else {
               answer += word[i] + " ";
           }



        }
        for(int i=0; i<cnt;i++){
            answer+= " ";
        }

        return answer;
    }
}