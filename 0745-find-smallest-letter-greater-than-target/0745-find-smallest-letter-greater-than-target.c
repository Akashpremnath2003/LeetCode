char nextGreatestLetter(char* letters, int lettersSize, char target) {
    int n=lettersSize;
    char a;
    for(int i=0;i<n;i++)
    {
        if(letters[i]>target)
        {
            a=letters[i];
            break;
        }
        else
        {
            a=letters[0];
        }
    }
    return a;
}   