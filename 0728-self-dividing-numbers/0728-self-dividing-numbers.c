/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* selfDividingNumbers(int left, int right, int* returnSize) {
    int m=right-left+1;
    int *a=malloc(m*sizeof(int));
    int i,j,n,r,c=0,f;
   for(i=left;i<=right;i++)
   {
        n=i;
        int a1=i;
        f=1;
        while(n)
        {
            r=n%10;
            if(r==0||i%r!=0)
            {
                f=0;
                break;
            }
            n=n/10;
        }
        if(f==1)
        {
            a[c++]=i;
        }
   }
   *returnSize=c;
   return a;
}