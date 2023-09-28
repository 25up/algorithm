import java.util.*;
class Solution {
    public static String solution(String s){
        String answer="";

        String[] stt = s.split(" ");
        int[] sin=new int[stt.length];
        for(int i=0;i<stt.length;i++)
            sin[i]=Integer.parseInt(stt[i]);
        Arrays.sort(sin);
        answer = sin[0] + " " + sin[sin.length - 1];
      
        return answer;

    }
}