int findSpecialInteger(int* arr, int arrSize) {
    int n=arrSize;
    int i,j,a[n],b[n],c1=0,f,c;
    for(i=0;i<n;i++)
    {
        f=1;
        for(j=0;j<i;j++)
        {
            if(arr[i]==arr[j])
            {
                f=0;
                break;
            }
        }
        if(f==1)
        {
            a[c1]=arr[i];
            c=1;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    c++;
            }
            b[c1++]=c;
        }

    }
    float ha=(float)n/4,aa;
    for(i=0;i<c1;i++)
    {
        if(b[i]>=ha)
            aa=a[i];
    }
 return aa;   
}