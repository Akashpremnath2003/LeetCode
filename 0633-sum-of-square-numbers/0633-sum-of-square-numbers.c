bool judgeSquareSum(int c) {
    int r=sqrt(c);
    long s=0,j;
    while(s<=r)
    {
        j=s*s+r*r;
        if(j==c)
            return 1;
        if(j<c)
        s++;
        else
        r--;
    }
    return 0;

}