/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* decode(int* encoded, int encodedSize, int first, int* returnSize) {
    int n=encodedSize;
    int i,j,d;
    int *a=malloc(10000*sizeof(int));
    a[0]=first;
    for(i=0;i<n;i++)
    {
        a[i+1]=encoded[i]^a[i];
        
    }
    *returnSize=i+1;
    return a;
}