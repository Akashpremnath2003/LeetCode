char* restoreString(char* s, int* indices, int indicesSize) {
    int n=indicesSize;
    int i,j,b[n];
    char *d=malloc(1000*sizeof(char));
    for(i=0;i<n;i++)
    {
        b[i]=indices[i];
    }
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(b[i]>b[j])
            {
                int c=b[i];
                b[i]=b[j];
                b[j]=c;
            }
        }
    }
    int c1=0;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(b[i]==indices[j])
            {
                printf("%c",s[j]);
                d[c1++]=s[j];
            }
        }
    }
    d[c1]='\0';
    return d;
}