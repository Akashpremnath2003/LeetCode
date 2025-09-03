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
         
        for(int i=0;i<matrix.length;i++)
        {
            int n=matrix[i].length-1;
            for(int j=0;j<matrix[i].length/2;j++)
            {
               int d=matrix[i][j];
               matrix[i][j]=matrix[i][n];
               matrix[i][n]=d;
               n--;
            }

        
        }
        

    }
}