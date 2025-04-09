bool isPerfectSquare(int num) {
    for(long i=1;i<=num;i++)
    {
        long m=i*i;
        if(num==m)
            return true;
    }
    return false;
}