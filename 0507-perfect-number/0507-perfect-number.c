bool checkPerfectNumber(int num) {
    int i,c=0;
    for(i=1;i<=num/2;i++)
    if(num%i==0)
        c+=i;
    if(num==c)
        return 1;
    return 0;
    
}