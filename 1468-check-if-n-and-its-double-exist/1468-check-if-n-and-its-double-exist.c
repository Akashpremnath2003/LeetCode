bool checkIfExist(int* arr, int arrSize) {
    int n=arrSize;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i!=j&&arr[i]==2*arr[j])
            {
                return true;
                break;
            }
        }
    }
    return false;
}