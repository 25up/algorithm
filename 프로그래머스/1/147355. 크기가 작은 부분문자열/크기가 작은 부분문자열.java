class Solution {
  public static int solution(String t, String p){
        int answer = 0;
        long[] arr= new long[t.length()-p.length()+1];

        for(int i = 0;i<=t.length()-p.length();i++){
            String sub= t.substring(i, i+p.length());
            System.out.println(sub);
            arr[i]=Long.parseLong(sub);
        }
        long pp=Long.parseLong(p);

        for(int j =0;j<arr.length;j++){
            if(arr[j]<=pp){
                answer++;
            }

        }
        return answer;
    }
}