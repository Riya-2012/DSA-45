class Solution {
    public int tribonacci(int n) {
          if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
      int OT=0;
      int ST=1;
      int TT=1;
      for(int i  =0;i<n;i++){
         int FT=OT+ST+TT;
        OT=ST;
        ST=TT;
        TT=FT;

      }
      return OT; 
    }
}