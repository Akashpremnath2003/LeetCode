class Solution {
    public String reverseWords(String s) {
      String a[]=s.split(" ");
    String s1="";
    System.out.println(a.length);
      for(int i=a.length-1;i>=0;i--)
    {
        if(a[i]=="")
            continue;
            s1=s1+a[i]+" ";
    }        
      return s1.trim();
    }
}