class Solution {
  public static boolean solution(String s){
        boolean answer= true;
        if(s.length()==4||s.length()==6) {
            answer =true;
            for (char ch = 'A'; ch <= 'z'; ch++) {
                if (s.contains(""+ch)) {
                    answer=false;
                    break;
                }

            }
        }
        else answer=false;
        return answer;
    }
}