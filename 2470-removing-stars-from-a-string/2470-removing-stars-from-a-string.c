char* removeStars(char* s) {
    int n=strlen(s);
    int i,j,c=0;
    char *a=(char *)malloc(1000000*sizeof(char));
    for(i=0;i<n;i++)
    {
        if(s[i]!='*')
        {
            a[c++]=s[i];
        }
        else
        {
            c--;
        }
    }
  a[c]='\0';
    return a;
}