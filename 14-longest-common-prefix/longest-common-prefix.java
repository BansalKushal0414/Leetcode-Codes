class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        int maxLength = Integer.MAX_VALUE;
        for(int i = 0;i<strs.length;i++){
            if(strs[i].length()<maxLength){
                maxLength = strs[i].length();
            }
        }

        int k = 0;
        while(k<maxLength){
            for (String s : strs) {
                if (s.charAt(k) != strs[0].charAt(k)) {
                    return strs[0].substring(0, k);
                }
            }
            k++;
        }
        return strs[0].substring(0, k);
    }
}