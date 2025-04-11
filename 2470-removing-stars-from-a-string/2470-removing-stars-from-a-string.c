char* removeStars(char* s) {
    int n=strlen(s);
    int c=0;
    char *a=(char *)malloc(n+1*sizeof(char));
    for(int i=0;i<n;i++)
        if(s[i]!='*')
            a[c++]=s[i];
        else
            c--;
  a[c]='\0';
    return a;
}