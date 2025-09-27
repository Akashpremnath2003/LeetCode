class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> l=Arrays.stream(nums).boxed().toList();
        int a=l.indexOf(target);
        int b=l.lastIndexOf(target);
        return new int[]{a,b};
    }
}