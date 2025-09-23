class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
    }
    static int first(int a[],int k)
    {
        int l=0;
        int r=a.length-1;
        int a1=-1;
        while(l<=r)
        {
            int m=(l+r)/2;
            if(a[m]==k)
            {
                a1=m;
                r=m-1;
            }
            else if(a[m]<k)
                l=m+1;
            else
                r=m-1;
        }
        return a1;

    }
    static int last(int a[],int k)
    {
        int l=0;
        int r=a.length-1;
        int a1=-1;
        while(l<=r)
        {
            int m=(l+r)/2;
            if(a[m]==k)
            {
                a1=m;
                l=m+1;
            }
            else if(a[m]<k)
                l=m+1;
            else
                r=m-1;
        }
        return a1;
        
    }
}