void reverseString(char* s, int sSize) {
    int i,c;
    int n=sSize;
    for(i=0;i<n;i++)
    {
        c=s[i];
        s[i]=s[n-1];
        s[n-1]=c;
        n--;

    }    
}