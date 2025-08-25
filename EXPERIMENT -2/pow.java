class Solution {
    public double myPow(double x, int n) {
       long N =n;
       if(N<0){
        x=1/x;
        N=-N;
       } 
       double result =1.0;
       double currproduct = x;
       while(N>0){
        if(N%2==1){
            result*=currproduct;
        }
        currproduct *= currproduct;
        N/=2;
       }
       return result;
    }
}
