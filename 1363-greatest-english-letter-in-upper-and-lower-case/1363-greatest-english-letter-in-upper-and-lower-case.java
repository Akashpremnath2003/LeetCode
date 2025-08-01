class Solution {
    public String greatestLetter(String s) {
        char []a=s.toCharArray();
        String z="";
        Set<Character> set=new TreeSet<>();
        for(char i:a)
            set.add(i);
        int c=0;
        List<Character> list=new ArrayList(set);
        System.out.println(set);
        char b[]=new char[set.size()];
        for(int i=0;i<set.size();i++)
        {
            if(Character.isLowerCase(list.get(i)))
                b[c++]=Character.toUpperCase(list.get(i));
            else
                b[c++]=list.get(i);
        }
        int d[]=new int[256];
        for(int i=0;i<b.length;i++)
        {
            d[b[i]]++;
        }
        char y=Character.MIN_VALUE;
        for(int i=0;i<b.length;i++)
        {
            if(d[b[i]]>=2)
                if(b[i]>y)
                {
                    y=b[i];
                }
        }
        z=z+y;
        if(y==Character.MIN_VALUE)
            return "";
        return z;
    }
}