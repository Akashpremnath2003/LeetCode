int numberOfSteps(int num) {
    int c;
    c=0;
    while(num!=0)
    {
    c++;
    if(num%2==0)
        num=num/2;
    else
        num--;
    }
return c;
}