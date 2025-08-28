class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++)       
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                s1=s1+s.charAt(i);
        }
        int l=0;
        int r=s1.length()-1;
        while(l<r)
        {
            if(s1.charAt(l)!=s1.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}