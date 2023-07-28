class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        int num = Integer.parseInt(tokens[0]);
        stack.push(num);

        for(int i = 1;i< tokens.length;i++) {
            System.out.print(tokens[i]+" ");
            if(tokens[i].equals("+")) {
                    if(stack.size() >= 2) {
                        stack.push(stack.pop() + stack.pop()); 
                    }
            } else if(tokens[i].equals("-")) {
                    if(stack.size() >= 2) {
                        int operand1 = stack.pop();
                        int operand2 = stack.pop();
                        stack.push(operand2 - operand1); 
                    }
            } else if(tokens[i].equals("/")) {
                if(stack.size() >= 2) {
                        int operand1 = stack.pop();
                        int operand2 = stack.pop();
                        stack.push(operand2 / operand1); 
                    }
            } else if(tokens[i].equals("*")) {
                if(stack.size() >= 2) {
                        stack.push(stack.pop() * stack.pop()); 
                    }
            } else {
                
                 num = Integer.parseInt(tokens[i]);
                 stack.push(num);
            }
        System.out.println("Size "+stack.size()+" Top "+stack.peek());
        }
        return stack.pop();
    }
}