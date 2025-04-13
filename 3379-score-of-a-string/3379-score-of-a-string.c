int scoreOfString(char* s) {
    int n=strlen(s),s1,s2=0;
    for(int i=0;i<n-1;i++)
    {
        s1=abs(s[i]-s[i+1]);
        s2=s2+s1;   
    }
    return s2;
}