int divide(int dividend, int divisor) {
    
     double n=(double)dividend/divisor;
     if(n>pow(2,31)-1)
        n=(pow(2,31)-1);
    if(n<pow(-2,31))
        n=pow(-2,31);
    return n;
}