int finalValueAfterOperations(char** nums, int operationsSize) {
    int n=operationsSize;
    int i,j,x=0;
    for(i=0;i<n;i++)
    {
        if(nums[i][1]=='-')
            x--;
        else
            x++;

    }
    return x;
}