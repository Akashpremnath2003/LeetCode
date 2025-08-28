void reverseString(char* a, int sSize) {
    int l=0;
    int r=sSize-1;
    while(l<r)
    {
        char c=a[l];
        a[l]=a[r];
        a[r]=c;
        l++;
        r--;
    }   

}