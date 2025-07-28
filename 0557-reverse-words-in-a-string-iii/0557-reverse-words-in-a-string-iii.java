class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        String b="";
        for(String i:a)
            b=b+new StringBuffer(i).reverse().toString()+" ";
        return b.trim();
    }
}