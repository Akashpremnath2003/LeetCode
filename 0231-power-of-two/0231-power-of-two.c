bool isPowerOfTwo(int n) {
if(n==1||n==8)
    return n;
if(n%2==0)
for(int i=1;i<=sqrt(n);i++)
    if(n==pow(2,i))
        return 1;
return 0;
}