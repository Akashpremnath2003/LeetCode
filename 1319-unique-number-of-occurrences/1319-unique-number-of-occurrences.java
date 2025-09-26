class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> list=Arrays.stream(arr).boxed().toList();
        Set<Integer> set=new HashSet(list);
        Set<Integer> set1=new HashSet<>();
        for(int k:set)
        {   
            set1.add(Collections.frequency(list,k));
        }
        return set1.size()==set.size();
    }
}