class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        int Ws=0;
        int We=0;
        int  maxLength=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        while(We<n){
char ch=s.charAt(We);
            if(map.containsKey(ch)&& map.get(ch)>=Ws){
                Ws=map.get(ch)+1;
            }
        
        map.put(ch,We);
        maxLength=Math.max(maxLength,We-Ws+1);
        We++;
    }
    return (maxLength==Integer.MIN_VALUE)?0:maxLength;
}
}