class Solution {
    public boolean isPalindrome(String s) {
        String s2=s.toLowerCase();
       String str1 = s2.replaceAll("[^a-zA-Z]", "");
       String reversedStr = new StringBuilder(str1).reverse().toString();
if(str1.equals(reversedStr)){
    return true;
}
     return false;   

    }

}