class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int iterator = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i<n;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && popped[iterator] == stack.peek()){
                stack.pop();
                iterator++;
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}