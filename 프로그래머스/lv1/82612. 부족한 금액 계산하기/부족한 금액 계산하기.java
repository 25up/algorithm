class Solution {
     public static long solution(int Price, int money,int count){
        long answer =0;
        long hap=0;
        for(long i =1;i<=count;i++){
            hap+=(Price*i);
        }
        if(hap>money) {
            answer = hap - money;
        }
        else if (hap<=money){
            answer=0;
        }
        return  answer;
    }
}