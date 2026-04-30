class Solution {
    public int maxDepth(String s) {
        int maxParentheses = 0;
        int total = 0;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                total++;
                maxParentheses = Math.max(maxParentheses,total);
            }
            if(ch==')') total--;
        }
        return maxParentheses;
    }
}