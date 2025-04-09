int countNegatives(int** grid, int gridSize, int* gridColSize) {
    int r=gridSize;
    int i,j,s=0;
    for(i=0;i<r;i++)
    {
        for(j=0;j<*gridColSize;j++)
        {
            if(grid[i][j]<0)
                s++;
        }
    }
    return s;
}