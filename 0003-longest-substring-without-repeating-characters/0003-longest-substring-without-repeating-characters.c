int lengthOfLongestSubstring(char* a) {
    int n = strlen(a);
    int maxLen = 0;
    int start = 0; // Start index of current window
    int i, j;

    for (i = 0; i < n; i++) {
        for (j = start; j < i; j++) {
            if (a[i] == a[j]) {
                start = j + 1;  // Move start after the previous occurrence
                break;
            }
        }

        // This must be outside the inner loop
        int len = i - start + 1;
        if (len > maxLen)
            maxLen = len;
    }

    return maxLen;
}
