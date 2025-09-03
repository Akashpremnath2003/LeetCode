class Solution {
    boolean check(int[][] a,int[][] b)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]!=b[i][j])
                    return false;
            }
        }
        return true;
    }
    void rotate(int[][] mat)
    {
        for(int i=0;i<mat.length-1;i++)
            {
                for(int j=i+1;j<mat[i].length;j++)
                {
                    int c=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=c;
                }
            }
            for(int i=0;i<mat.length;i++)
            {
                int n=mat[i].length-1;
                for(int j=0;j<mat[i].length/2;j++)
                {
                    int c1=mat[i][n];
                    mat[i][n]=mat[i][j];
                    mat[i][j]=c1;
                    n--;
                }
            }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
    for(int x=0;x<4;x++)
    {
        if(check(mat,target))
        {
            return true;
        }
        else
        {
            rotate(mat);
        }
    }
        return false;

    }
}