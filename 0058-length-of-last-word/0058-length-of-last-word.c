int lengthOfLastWord(char* s) {
    int n=strlen(s);
    int i,c=0,m=0,a[n+1],b[n+1];
    for(i=0;i<n;i++)
    {
        if(s[i]>=65&&s[i]<=90||s[i]>=97&&s[i]<=122)
        {
            c++;
        }
        else
        {
            c=0;
        }
        a[m++]=c;
    }
    c=0;
    for(i=0;i<m;i++)
    {
        if(a[i]!=0)
            b[c++]=a[i];
            
    }
    return b[c-1];
}