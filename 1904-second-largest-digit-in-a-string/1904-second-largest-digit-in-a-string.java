class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> set=new TreeSet<>();
        for(char i:s.toCharArray())
        {
            if(Character.isDigit(i))
                set.add(i-'0');
        }
        if(set.size()<2)
            return -1;
        List<Integer> li=new LinkedList<>(set);
        System.out.println(li);
        return li.get(set.size()-2);
    }
}