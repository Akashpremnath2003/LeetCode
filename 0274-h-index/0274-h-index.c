int hIndex(int* citations, int citationsSize) {
    int n=citationsSize;
    int i,j;
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(citations[i]<citations[j])
            {
                int c=citations[i];
                citations[i]=citations[j];
                citations[j]=c;
            }
        }
    }   
    int c1=0;
    for(i=0;i<n;i++)
    {
        if(citations[i]>=i+1)
        {
            c1++;
        }
    }
    return c1;
}