class Solution {
    public String reverseWords(String s) {
        char a[]=s.toCharArray();
        int l=0;
		int r=s.length()-1;
		while(l<r)
		{
			char c1=a[l];
			a[l]=a[r];
			a[r]=c1;
			l++;
			r--;
		}

		int j=0;
		l=0;
		for(int i=0;i<s.length();i++)
		{
			if(a[i]==' ')
			{
				r=i-1;
				while(l<r)
				{
					char c1=a[l];
					a[l]=a[r];
					a[r]=c1;
					l++;
					r--;
				}
				l=i+1;
				
			}
		}
		r=s.length()-1;
		while(l<r)
		{
			char c1=a[l];
			a[l]=a[r];
			a[r]=c1;
			l++;
			r--;
		}
        String ans="";
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==' '&&a[i+1]==' ')
				continue;
			ans=ans+a[i];
		}
        ans=ans+a[a.length-1];

        
        return ans.trim();
    }
}