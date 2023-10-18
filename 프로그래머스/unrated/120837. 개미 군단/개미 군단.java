class Solution {
   public int solution(int hp){
        int answer=0;
        int a = 0;
        int aa= 0;
        int bb=0;
        int b= 0;
        int c=0;
        
        if(hp>=5) {
            a = hp / 5;
            aa=hp%5;
            b=aa/3;
            bb=aa%3;
            c=bb/1;
            answer=a+b+c;
        }
        else if(hp<5&&hp>=3) {
            b = hp / 3;
            bb= hp%3;
            c= bb/1;
            answer=b+c;
        } else if (hp<3) {
            answer=hp/1;
        }

        return  answer;
    }
}