class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l1=new ArrayList<>();
        String k1=String.valueOf(x);
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(k1))
                l1.add(i);
        }
        return l1;

    }
}