class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;

        int len = s.length();

        for(int i = 0; i<len;i++){
            boolean match = true;

            for(int j = 0; j < len; j++){
                if(s.charAt(j) != goal.charAt((j+i)%len)){
                    match = false;
                    break;
                }
            }

            if(match) return true;
        }
        return false;
    }
}