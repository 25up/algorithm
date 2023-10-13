import java.util.*;

public class Solution {
      public static int[] solution(int []arr){
            int n = arr.length;
            int a = 1;
           for(int i = 1;i<n;i++){
               if(arr[i]!=arr[i-1]){
                   a++;
               }
           }

            int[] answer = new int[a];
            answer[0]=arr[0];
            int j=1;
            for(int i =1;i<n;i++){
                if(arr[i]!=arr[i-1]){
                    answer[j++]=arr[i];
                }

            }



        return answer;
    }
}