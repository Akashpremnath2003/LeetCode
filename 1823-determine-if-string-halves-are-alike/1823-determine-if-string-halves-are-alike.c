bool halvesAreAlike(char* s) {
    int n=strlen(s);
    int x=n/2;
    int c=0,c1=0,c2=0,i;
    
    if(n%2==0)
    {
        for(i=0;i<n;i++)
        {
            if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='O'||s[i]=='U'||s[i]=='I')
            {
                if(c<x)
                    c1++;
                else
                    c2++;
                
            }
            c++;
        }
    }
    if(c1==c2)
    {
        return 1;
    }
    return 0;
}