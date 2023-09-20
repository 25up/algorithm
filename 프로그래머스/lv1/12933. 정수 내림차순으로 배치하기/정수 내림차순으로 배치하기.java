class Solution {
   public static long solution(long n) {
        String str="";
       int a = (int)Math.log10(n)+1;
       long[] answer = new long[a];
       long answer2=0;
       long bb=0;
       long c = 0;
       long d = n;
       for(int b=0;b<a;b++){
           c=d%10;
           d=d/10;
           answer[b]+=c;
       }
         for(int i =0; i<a;i++) {
             for (int j = 0; j < a-1 ; j++) {
                 if (answer[j] < answer[j + 1]) {
                     bb = answer[j];
                     answer[j] = answer[j + 1];
                     answer[j + 1] = bb;

                 }

             }

         }
            for(int j =0; j<a;j++)
                str+=answer[j];
            answer2=Long.parseLong(str);
            return answer2;

    }
}
