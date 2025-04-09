bool isPowerOfFour(int n) {
    if(n==1)
        return n;
    if(n%4==0)
    for(int i=1;i<=sqrt(n);i++)
        if(n==pow(4,i))
            return n;
    return 0;
}