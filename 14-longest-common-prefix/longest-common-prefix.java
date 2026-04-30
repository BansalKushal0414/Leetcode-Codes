class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }

        int maxLength = Integer.MAX_VALUE;

        for(String s : strs){
            if(s.length() < maxLength){
                maxLength = s.length();
            }
        }

        int start = 0;

        while(start < maxLength){
            for(String s : strs){
                if(s.charAt(start) != strs[0].charAt(start)){
                    return strs[0].substring(0,start);
                }
            }
            start++;
        }
        return strs[0].substring(0,start);
    }
}