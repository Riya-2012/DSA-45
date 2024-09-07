class Solution {
    public String reverseWords(String s) {
     
        StringBuilder res=new StringBuilder();
       int SI=s.length()-1;
       while(SI >=0){
        while(SI>=0 && s.charAt(SI)==' '){
            SI--;

        }
        if(SI<0){
            break;

        }
        int EI=SI;
        while(SI>=0 &&s.charAt(SI)!=' '){
            SI--;
        }
        if(res.length()==0){
            res.append(s.substring(SI+1,EI+1));
        }
        else{
            res.append(" ");
          res.append(s.substring(SI+1,EI+1));

        }
              }
                  return res.toString();
    }

}