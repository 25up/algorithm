class Solution {
    public static int solution(int[][] sizes){
        int answer=0;
        int h=0;
        int w=0;
        int hmax=0;
        int wmax=0;

        for(int[] size: sizes){
            h=size[0];
            w=size[1];
            hmax=Math.max(hmax, Math.max(h, w));
            wmax=Math.max(wmax,Math.min(w,h));


        }


        return answer=hmax*wmax;
    }
}