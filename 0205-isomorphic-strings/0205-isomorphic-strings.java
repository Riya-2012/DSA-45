class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length()!=t.length()){

        return false;
       } 
       Map<Character,Character> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char o=s.charAt(i);
        char r=t.charAt(i);
        if(!map.containsKey(o)){
            if(!map.containsValue(r)){
                map.put(o,r);
            }
            else{
                return false;
            }
        }
            else {
                char matched= map.get(o);
                if(matched!=r){
                    return false;
                }
            
            
        }
       }
     
       return true;
    }
}