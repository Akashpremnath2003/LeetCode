class Solution {
    

    public int lengthOfLongestSubstring(String s) {
        List<Character> li=new ArrayList<>();
        int l=0;
        int max=0;
        char a[]=s.toCharArray();
       for(int i=0;i<a.length;i++)
       {
        while(li.contains(a[i]))
        {
            System.out.println(li.remove(l));

        }  
        li.add(a[i]);
        max=Math.max(max,li.size());
       }
       return max;
    }
}