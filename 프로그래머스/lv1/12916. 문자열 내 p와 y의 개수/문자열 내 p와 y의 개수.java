class Solution {
    public static boolean solution(String s){
        boolean answer = true;

        int sump =0;
        int sumy =0;
        for(int i = 0; i <s.length();i++) {
            if (s.toUpperCase().charAt(i)=='P')
                sump += 1;
            else if (s.toUpperCase().charAt(i)=='Y')
                sumy += 1;
        }
        if(sump==sumy)
            answer=true;
        else if(sump!=sumy)
            answer=false;

    return answer;
    }
}