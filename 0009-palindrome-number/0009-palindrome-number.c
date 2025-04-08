bool isPalindrome(int x) {
    if(x<0)
    return false;
        int n=x;
        long sum=0;
        while(x)
        {
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(sum==n)
        return true;
        return false;
}