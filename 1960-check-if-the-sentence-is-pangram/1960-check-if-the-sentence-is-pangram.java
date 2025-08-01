class Solution {
    public boolean checkIfPangram(String sentence) {
        String b=sentence.toLowerCase();
        char a[]=b.toCharArray();
        Set<Character> c=new TreeSet<>();
        for(char i:a)
            c.add(i);
        if(c.size()==26)
            return true;
        return false;

    }
}