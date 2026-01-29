class Solution {
    public String removeKdigits(String num, int k) {
        char[] number = num.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char curr : number){
            while(!stack.isEmpty() && stack.peek() > curr && k > 0){
                stack.pop();
                k--;
            }
            stack.push(curr);
        }

        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        ans.reverse();

        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
}