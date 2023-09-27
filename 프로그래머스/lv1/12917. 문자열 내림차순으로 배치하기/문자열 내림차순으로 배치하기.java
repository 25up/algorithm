import java.util.Collections;
import java.util.Arrays;
class Solution {
  public static String solution(String s) {
        String answer="";
        int sl = s.length();
        String[] us= new String[sl];
        for (int i =0;i<sl;i++) {
            us[i] = s.substring(i,i+1);
        }
        Arrays.sort(us, Collections.reverseOrder());
        for(int i=0; i<sl;i++)
            answer+=us[i];


        return answer;
    }
}