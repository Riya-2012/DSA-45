class Solution {
    public String addBinary(String a, String b) {
         int carry =0;
        int aL=a.length();
        int bL=b.length();
        int i=0;
        String ans="";
        while(i<aL||i<bL|| carry!=0){
            int x=0;
            if(i<aL && a.charAt(aL-i-1)=='1'){
                x=1;
            }
            int y=0;
             if(i<bL && b.charAt(bL-i-1)=='1'){
                y=1;
            }
            ans =(x+y+carry)%2+ans;
            carry=(x+y+carry)/2;
            i+=1;
    
        }
         return ans;
    }
}