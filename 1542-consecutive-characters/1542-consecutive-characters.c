int maxPower(char* s) {
    int n=strlen(s);
    long i,j,c,c1=0;
    int *a=malloc(1000*sizeof(int));
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=i;j<n;j++)
        {
            if(s[i]==s[j])
                c++;
            else
                break;
          
        }
        a[c1++]=c;
    }
    int l=a[0];
    for(i=0;i<c1;i++)
    {
        if(a[i]>l)
            l=a[i];
       
    }
    return l;
    
}