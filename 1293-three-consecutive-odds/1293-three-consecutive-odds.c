bool threeConsecutiveOdds(int* arr, int arrSize) {
    int n=arrSize;
    int i,c=0,f,a;
    for(i=0;i<n;i++)
    {
        f=0;
        if(arr[i]%2!=0)
        {
            c++;
            if(c==3)
            {
                 f=1;
                 break;
            }
        }
        else
            c=0;
    }
if(f==1)
    a=1;
else
    a=0;
return f;
}