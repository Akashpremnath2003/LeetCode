bool checkString(char* s) {
    int n=strlen(s);
    int i;
    for(i=0;i<n-1;i++)
    {
        if(s[i]=='b'&&s[i+1]=='a')
            return 0;
    }
    return 1;
}