class Solution {
    public int[] resultArray(int[] nums) {
        int a[]=new int[nums.length];
        int b[]=new int[nums.length];
        int c1=0;
        int c2=0;
        if(nums.length>=2)
        {
        a[c1]=nums[0];
        b[c2]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            if(a[c1]>b[c2])
                a[++c1]=nums[i];
            else
                b[++c2]=nums[i];

        }        
        }
        c1++;
        int c=0;
        System.out.println(c2);
        for(int i=0;i<c1;i++)
            nums[c++]=a[i];
        c2++;
        for(int i=0;i<c2;i++)
            nums[c++]=b[i];
        return nums;
    }
}