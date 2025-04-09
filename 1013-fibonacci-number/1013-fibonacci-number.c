

int fib(int n){
int a,b,c,i;
a=-1;
b=1;
for(i=0;i<=n;i++)
{
    c=a+b;
    a=b;
    b=c;
}
return c;
}