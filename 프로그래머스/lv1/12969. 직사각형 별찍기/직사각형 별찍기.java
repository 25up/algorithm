import java.util.Scanner;

class Solution {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a,b));
    }
    public static String solution(int a,int b){
        String answer="";
        String st="";
        String star="*";
        for(int i =1;i<=a;i++)
            st+=star;
        for(int j =0;j<b;j++)
            answer+=st+"\n";


        return answer;
    }
}