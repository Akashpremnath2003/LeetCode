class Solution {
    public String compressedString(String word) {
       int a[]=new int[256];
       char b[]=word.toCharArray();
       String s="";
       for(char j:b)
        a[j]=1;
        for(int i=0;i<word.length()-1;i++)
        {
            if(a[b[i]]>=9||b[i]!=b[i+1])
            {
                s=s+a[b[i]]+b[i];
               
                a[b[i]]=1;
            }
            else
            {
                a[b[i]]++;
            }
        }
        s+=a[b[b.length-1]];
        s+=b[b.length-1];
        return s;
    }
}