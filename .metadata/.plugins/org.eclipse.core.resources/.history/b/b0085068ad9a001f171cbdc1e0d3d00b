import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        
        int A = a;
        int B = b;
        int cnt1 = 0;
        int cnt2 = 0;
        
        while(A>0){
            A /= 10;
            cnt1++;
            
        }
        
         while(B>0){
            B /= 10;
            cnt2++;
        }
        
        int ab = a*(int)Math.pow(10,cnt2) + b;
        int ba = b*(int)Math.pow(10,cnt1) + a;
        
        if(ab>=ba){
            return ab;
        }
        else{
            return ba;
        }
        
    }
}