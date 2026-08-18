package stack;

import java.util.Stack;

class BaseballGame {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
    }
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<operations.length; i++){
            if (operations[i].equals("C") && !stack.isEmpty())
                stack.pop();
            else if (operations[i].equals("D"))
                stack.push(stack.peek() * 2);
            else if (operations[i].equals("+")){
                int first =stack.peek();
                int second = stack.get(stack.size()-2);
                stack.push(first+second);
            }else{
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}