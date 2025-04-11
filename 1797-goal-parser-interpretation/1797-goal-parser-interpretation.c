

char * interpret(char * s){
    int n=strlen(s);
    char *a=malloc(1000*sizeof(char));
    int i,c=0;
    for(i=0;i<n;i++)
    {
        if(s[i]=='G')
        {
            a[c++]='G';
        }
        if(s[i]=='('&&s[i+1]==')')
        {
            a[c++]='o';
        }
        if(s[i]=='('&& s[i+1]=='a'&&s[i+2]=='l'&&s[i+3]==')')
        {
            a[c++]='a';
            a[c++]='l';
        }

            
    }
    
    a[c]='\0';
return a;
}