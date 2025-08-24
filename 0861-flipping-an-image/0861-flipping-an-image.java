class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image[0].length;
        int b[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j--)
            {
                b[i][j]=image[i][c-j-1];
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(b[i][j]==1)
                    b[i][j]=0;
                else
                    b[i][j]=1;
            }

        }

      return b;
    }
}