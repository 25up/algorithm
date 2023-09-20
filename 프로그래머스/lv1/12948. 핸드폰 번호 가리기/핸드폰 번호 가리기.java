class Solution {
 public static String solution(String phone_number){
        String answer="";
        int a = phone_number.length();
        char[] ph=new char[a];
        for(int i=0;i<a;i++)
            ph[i]+=phone_number.charAt(i);

        for(int i = 0;i<a-4;i++)
            ph[i]='*';

        for(int i = 0;i<a;i++)
            answer+=ph[i];



        return answer;

    }
}