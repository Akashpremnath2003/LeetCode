bool uniqueOccurrences(int* arr, int arrSize) {
    int n=arrSize;
    int a[1000],i,j,f,c,h=0;
    for(i=0;i<n;i++)
    {
        f=0;
        for(j=0;j<i;j++)
        {
            if(arr[i]==arr[j])
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            c=1;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            a[h++]=c;
        }
       
    }
   c=0;
  for(i=0;i<h;i++)
    {
        f=1;
        for(j=i+1;j<h;j++)
        {
            if(a[i]==a[j])
            {
                f=0;
                break;
            }
        }
        if(f==0)
        {
            break;
        }
        
    }
    return f;
}