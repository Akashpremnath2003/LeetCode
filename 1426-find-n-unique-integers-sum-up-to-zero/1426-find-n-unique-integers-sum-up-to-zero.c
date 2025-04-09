/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sumZero(int n, int* returnSize) {
    *returnSize=n;
    int *a=malloc(n*sizeof(int));
    int i;
    for(i=0;i<n;i++)
    {
        a[i]=i*2-n+1;
    }   
    return a;
}