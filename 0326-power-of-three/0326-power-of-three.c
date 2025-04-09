bool isPowerOfThree(int n) {
    if(n==1)
        return n;
   if(n%3==0)
   {
    for(int i=1;i<=sqrt(n);i++)
        if(n==pow(3,i))
            return n;
   }
   return 0;
}