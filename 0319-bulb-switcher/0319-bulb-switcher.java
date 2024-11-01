class Solution {
    public int bulbSwitch(int n) {
        int i=1;
        int c=0;
        while(i*i<=n){
            c++;
            i++;
        }
        return c;
    }
}