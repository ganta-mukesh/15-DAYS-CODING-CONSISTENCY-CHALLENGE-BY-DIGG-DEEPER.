class Solution {
    public boolean isPalindrome(String s) {
      char[] chs = s.toCharArray();  
      int i=0;
      int j=s.length()-1;
      for(;i<j;){
        if(!Character.isLetterOrDigit(chs[i])){
        i++;
        continue;
        }
        if(!Character.isLetterOrDigit(chs[j])){
        j--;
         continue;
        }  
        if(Character.toLowerCase(chs[i])!=Character.toLowerCase(chs[j])){
            return false;
        }
        else
        i++;
        j--;
      }
      return true;
    }
}