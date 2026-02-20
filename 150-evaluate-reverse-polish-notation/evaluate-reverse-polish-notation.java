class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String curr = tokens[i];
            if(curr.equals("+")){
                int num1 = numbers.pop();
                int num2 = numbers.pop();

                numbers.push(num1+num2);
            }
            else if(curr.equals("-")){
                int num1 = numbers.pop();
                int num2 = numbers.pop();

                numbers.push(num2-num1);
            }
            else if(curr.equals("*")){
                int num1 = numbers.pop();
                int num2 = numbers.pop();

                numbers.push(num1*num2);
            }
            else if(curr.equals("/")){
                int num1 = numbers.pop();
                int num2 = numbers.pop();
                numbers.push(num2/num1);    
            }
            else{
                numbers.push(Integer.parseInt(curr));
            }
        }
        return numbers.pop();
    }
}