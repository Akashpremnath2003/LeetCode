class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long v=1L*length*width*height;
        String b="";
        String m="";
        String ans="";
        if(length>=Math.pow(10,4)||width>=Math.pow(10,4)||height>=Math.pow(10,4)||mass>=Math.pow(10,4)||v>=Math.pow(10,9))  
            b="Bulky";
        if(mass>=100)
            m="Heavy";
        if( b.equals("Bulky")&&m.equals("Heavy")) 
            ans="Both";
        else if(b.equals("Bulky")&&!m.equals("Heavy"))
            ans="Bulky";
        else if(!b.equals("Bulky")&&m.equals("Heavy"))
            ans="Heavy";
        else
            ans="Neither";
        
return ans;
    }
}