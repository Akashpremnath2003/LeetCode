

bool searchMatrix(int** matrix, int r, int* c, int target){
    int i,j;
    for(i=0;i<r;i++)
    {
        for(j=0;j<*c;j++)
        {
            if(matrix[i][j]==target)
            {
                return 1;
            }
        }
    }
    return 0;
}