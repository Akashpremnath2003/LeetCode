class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++)
        {
            for(int j=i+1;j<matrix[i].length;j++)
            {
                int c=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=c;
            }
        
        }
         int n=matrix[0].length;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length/2;j++)
            {
               int d=matrix[i][j];
               matrix[i][j]=matrix[i][n-1-j];
               matrix[i][n-1-j]=d;
            }

        
        }
        

    }
}