class Solution {
    public static int solution(int[] a,int[] b){
        int answer=0;
        
        int[] juk=new int[a.length];
        for(int i = 0; i < a.length;i++)
            juk[i]=a[i]*b[i];
        for(int i = 0; i<a.length;i++)
            answer+=juk[i];
        
        return answer;
    }
}