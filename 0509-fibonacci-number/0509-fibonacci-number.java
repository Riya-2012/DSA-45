class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
      int FT=0;
      int ST=1;
      
      for(int i  =0;i<n;i++){
         int TT=FT+ST;
        FT=ST;
        ST=TT;

      }
      return FT;
    }
}