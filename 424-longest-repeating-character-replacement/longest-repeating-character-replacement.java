class Solution {
    public int characterReplacement(String s, int k) {
        int[] charArr = new int[26];
        int maxLength = 0;
        int leftPointer = 0;
        int maxFreq = 0;

        for(int i = 0;i<s.length();i++){
            charArr[s.charAt(i) - 'A']++;
            maxFreq = Math.max(maxFreq, charArr[s.charAt(i) - 'A']);

            int window = i - leftPointer + 1;
            if(window - maxFreq > k){
                charArr[s.charAt(leftPointer) - 'A']--;
                leftPointer++;
            }
            maxLength = Math.max(maxLength, i - leftPointer + 1);
        }
        return maxLength;
    }
}