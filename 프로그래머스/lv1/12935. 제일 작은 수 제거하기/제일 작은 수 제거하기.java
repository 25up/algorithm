import java.util.Arrays;
class Solution {
  public static int[] solution(int[] arr) {
        int remo = arr.length;
        int dd = 0;
        int c = Arrays.stream(arr).min().getAsInt();

        if (remo < 2) {
            int[] answer = {-1};
            return answer;
        }
        
            int[] answer = new int[remo-1];
            int bb=0;

            for (int i = 0; i < remo; i++) {
                    
                if (arr[i] != c) {
                   answer[bb] += arr[i];
                    bb++;
                }
            }
         

        return answer;
    }
  
}

