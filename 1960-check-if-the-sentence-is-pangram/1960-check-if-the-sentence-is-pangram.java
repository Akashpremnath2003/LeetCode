class Solution {
    public boolean checkIfPangram(String sentence) {
        String b=sentence.toLowerCase();
        char a[]=b.toCharArray();
        Set<Character> c=new HashSet<>();
        for(char i:a)
            c.add(i);
       
        return c.size()==26;

    }
}