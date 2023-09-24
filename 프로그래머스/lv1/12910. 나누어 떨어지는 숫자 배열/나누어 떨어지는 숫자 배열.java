import java.util.Arrays;
class Solution {
    public static int[] solution(int[] arr,int divisor){
        int b=0;
        int c=0;
        for (int i = 0;i<arr.length;i++)
            if(arr[i]%divisor==0){
                b++;
            }
        if(b==0) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[b];

        for(int j = 0; j<arr.length;j++) {
        if(arr[j]%divisor==0){
            answer[c]=arr[j];
            c++;
        }
        }
        Arrays.sort(answer);
        



        return answer;

    }
}