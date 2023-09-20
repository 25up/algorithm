class Solution {
     public static boolean solution(int x){
        boolean answer= true;

        int a = (int)Math.log10(x)+1;
        int[] aa= new int[a];
        int b= 0;
        int c= x;
        int d=0;
        for(int i=0;i<a;i++) {
            b = c % 10;
            c = c / 10;
            aa[i]+=b;
        }
        for(int i=0;i<a;i++) {
            d += aa[i];
        }
        if(x%d==0)
            answer=true;
        else
            answer=false;




        return answer;
    }
}