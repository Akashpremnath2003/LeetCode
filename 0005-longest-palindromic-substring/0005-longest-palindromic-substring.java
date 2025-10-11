class Solution {
    // your Myequ() still here (not used in main loop for speed)
    String Myequ(StringBuffer s1)
    {
        char a[] = s1.toString().toCharArray();
        int l = 0, r = a.length - 1;
        while (l < r)
        {
            char x = a[l];
            a[l] = a[r];
            a[r] = x;
            l++;
            r--;
        }
        return new String(a);
    }

    // helper function to check palindrome directly (faster)
    boolean isPalindrome(String s, int start, int end)
    {
        while (start < end)
        {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s)
    {
        int n = s.length();
        String ans = "";
        int m = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                int len = j - i + 1;

                // only check longer substrings
                if (len > m && isPalindrome(s, i, j))
                {
                    ans = s.substring(i, j + 1);
                    m = len;
                }
            }
        }
        return ans;
    }
}
