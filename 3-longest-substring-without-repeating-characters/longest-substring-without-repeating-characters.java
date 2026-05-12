class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        if(s.trim().equals("")) return 1;
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int length = s.length();
        int[] ch = new int[256];

        while (end < length) {
            ch[s.charAt(end)]++;

            while (ch[s.charAt(end)] > 1) {
                ch[s.charAt(start)]--;
                start++;
            }

            int lengthBetween = end - start + 1;
            maxLength = Math.max(maxLength, lengthBetween);
            end++;
        }
        return maxLength;
    }
}