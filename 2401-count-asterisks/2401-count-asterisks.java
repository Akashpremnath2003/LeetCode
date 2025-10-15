class Solution {
    public int countAsterisks(String s) {
        String a[]=s.split("\\|");
        System.out.println(Arrays.toString(a));
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                char b[]=a[i].toCharArray();
                System.out.println(a[i]);
                for(char j:b)
                if(j=='*')
                    c++;
            }


        }    
        return c;
    }
}