class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(char a:s.toCharArray())
        {
            if((!s1.empty())&&((s1.peek()=='('&& a ==')')||(s1.peek()=='['&& a ==']')||(s1.peek()=='{'&& a =='}')))
                s1.pop();
            else
                s1.push(a);   

        }
        System.out.println(s1);
   
    return s1.empty();
           
    }
    
    
}