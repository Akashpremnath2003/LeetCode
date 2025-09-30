class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a1=0,a2=0;
        for(int k:nums1)
        {
            if(Arrays.binarySearch(nums2,k)>=0)
                a1++;
        }
        for(int k:nums2)
        {
            if(Arrays.binarySearch(nums1,k)>=0)
                a2++;
        }

        return new int[]{a1,a2};
    }
}