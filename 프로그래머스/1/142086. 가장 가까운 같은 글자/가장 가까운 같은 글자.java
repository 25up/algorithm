import java.util.HashMap;
import java.util.Map;
class Solution {
    public static int[] solution(String s) {
        Map<Character, Integer> lasts= new HashMap<>(); 
        int[] result = new int[s.length()]; 

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (lasts.containsKey(currentChar)) {
                int lastIndex = lasts.get(currentChar);
                result[i] = i - lastIndex;
            } else {
                result[i] = -1;
            }
            lasts.put(currentChar, i);
        }

        return result;
    }
}