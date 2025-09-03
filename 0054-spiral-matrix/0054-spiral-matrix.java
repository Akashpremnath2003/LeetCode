class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int rs=0,cs=0;
        int re=matrix.length;
        int ce=matrix[0].length;
        while(rs<re&&cs<ce)
        {
            for(int i=cs;i<ce;i++)
                ans.add(matrix[rs][i]);
            rs++;
            for(int i=rs;i<re;i++)
                ans.add(matrix[i][ce-1]);
            ce--;
            if(rs<re)
            {
            for(int i=ce-1;i>=cs;i--)
                ans.add(matrix[re-1][i]);
            re--;
            }
            if(cs<ce)
            {
            for(int i=re-1;i>=rs;i--)
                ans.add(matrix[i][cs]);
            cs++;
            }
            
        }  
        return ans;
    }
}