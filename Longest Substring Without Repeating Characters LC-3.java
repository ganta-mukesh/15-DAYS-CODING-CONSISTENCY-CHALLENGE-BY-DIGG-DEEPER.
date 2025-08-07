class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int maxLen = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            start = Math.max(index[c], start);
            maxLen = Math.max(maxLen, end - start + 1);
            index[c] = end + 1;
        }
        return maxLen;
    }
}
