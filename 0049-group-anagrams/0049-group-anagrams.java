class Solution {
      private String getFrequencystring(String str){

        int[] freq=new int[26];
        for(char c:str.toCharArray()){

            freq[c-'a']++;


        }
        StringBuilder Fs =new  StringBuilder("");
        char c='a';
        for(int i:freq){
            Fs.append(c);

            Fs.append(i);
            c++;

        }
        return  Fs.toString();
       }
    public List<List<String>> groupAnagrams(String[] strs) {
       
               if(strs==null|| strs.length==0){

            return new ArrayList<>();
        }

        Map<String,List<String>> Freq=new HashMap<>();
        for(String str :strs){
            String Fs=getFrequencystring(str);
            if(Freq.containsKey(Fs)){
                Freq.get(Fs).add(str);
            }
            else{
                List<String> List=new ArrayList<>();
                List.add(str);
                Freq.put(Fs,List);
            }
        }
        return new ArrayList<>(Freq.values());
    }
}