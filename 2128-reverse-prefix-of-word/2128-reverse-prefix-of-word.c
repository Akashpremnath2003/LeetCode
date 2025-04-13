char* reversePrefix(char* word, char ch) {
    int n=strlen(word);
    int i,j,c=0,f;
    char *a=malloc(n+1*sizeof(char));
    for(i=0;i<n;i++)
    {
        f=1;
        c++;
        if(word[i]==ch)
        {
            f=0;
            break;
        }
    }
    if(f==1)
    {
        return word;
    }
    int c1=0;
    for(i=c-1;i>=0;i--)
    {
        a[c1++]=word[i];
    }
    for(i=c;i<n;i++)
    {
        a[c1++]=word[i];
    }
    
   a[c1]='\0';
    return a;
}