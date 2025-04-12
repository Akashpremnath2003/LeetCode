int lengthOfLastWord(char* s) {
    int i=strlen(s)-1;
    int c=0,f=0;
    while(i>=0)
    {
       if(isalpha(s[i]))
        f=1;
    if(f==1)
    {
       if(s[i]==' ')
        break;
        else      
        c++; 
    } 
    i--;
    }
    return c;
}