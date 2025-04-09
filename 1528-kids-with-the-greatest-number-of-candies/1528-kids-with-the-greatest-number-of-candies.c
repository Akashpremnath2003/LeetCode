/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    *returnSize=candiesSize;
    int n=candiesSize;
    bool *a=malloc(n*sizeof(bool));
    int *b=malloc(n*sizeof(int));
    int i,j,f;
    for(i=0;i<n;i++)
    {
        b[i]=candies[i]+extraCandies;
        f=1;
        for(j=0;j<n;j++)
        {
            if(b[i]<candies[j])
            {
                f=0;
                break;
            }
        }
        a[i]=f;
    }
return a;
}