class Solution {
   public static String solution(int n){
        String answer="";
        String soobak="수박";
        String soo="수";
        if(n%2==0){
             for(int i=1;i<=n/2;i++){
                answer+=soobak;
            }

        } else if (n%2==1) {
            for(int i=1;i<=n/2;i++){
                answer+=soobak;
            }
            answer+=soo;
        }


        return answer;
    }
}