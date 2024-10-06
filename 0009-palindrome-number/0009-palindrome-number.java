class Solution {
    public boolean isPalindrome(int x) {
      if(x<0){
        return false;

      }
      int revno=0;
      int n =x;
      while(n>0){
        int d=n%10;
        revno=revno*10+d;
        n=n/10;
      }
      if(revno==x){
        return true;
      }
      else{
      return false;
      }





    }
}