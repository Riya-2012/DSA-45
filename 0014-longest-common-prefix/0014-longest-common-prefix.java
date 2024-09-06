class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);
        char[] f=strs[0].toCharArray();
        char[] l=strs[strs.length-1].toCharArray();
        for(int i=0;i<f.length;i++){
            if(f[i]!=l[i])

            break;
            result.append(f[i]);

            
        
        }
        return result.toString();
    }
}