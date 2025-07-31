class Solution {
    public char repeatedCharacter(String s) {
       int a[]=new int[256];
       char b='a';
        for(int i=0;i<s.length();i++)
        {
            int x=a[s.charAt(i)]++;
            if(x==1)
                return s.charAt(i);
        }
        return b; 
    }
}