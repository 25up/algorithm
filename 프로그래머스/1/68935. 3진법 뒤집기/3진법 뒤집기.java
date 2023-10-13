class Solution {
    public static int solution(int n){
        int answer = 0;
        int cc=n;
        int k=0;
        int h=0;
        int a=0;
    while(cc!=0) {
        cc = cc / 3;
        a++;
    }
    int[] arr=new int[a];
    for(int i=0;i<a;i++){
        k=n%3;
        arr[a-1-i]=k;
        n= n/3;
        if(n==0)
            break;
    }
   for(int i =0;i<a;i++) {
       h = (int) Math.pow(3, i);
       answer += arr[i] * h;
   }
        return answer;
    }
}