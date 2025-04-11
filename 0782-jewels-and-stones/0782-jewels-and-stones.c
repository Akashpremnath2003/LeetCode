int numJewelsInStones(char* jewels, char* stones) {
    int n1=strlen(jewels);
    int n2=strlen(stones),c=0,i,j;
    for(i=0;i<n1;i++)
    {
        for(j=0;j<n2;j++)
        {
            if(jewels[i]==stones[j])
            {
                c++;
            }
        }
    }
    return c;
}