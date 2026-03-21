package stack;

import java.util.Stack;

public class ReverseStack {

    public static void reverseStack(Stack<Integer> stack)
    {
        Stack<Integer> reverse = new Stack<>();

        while(!stack.isEmpty())
        {
            reverse.push(stack.pop());
        }

        System.out.println("reverse stack : " + reverse);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack(stack);
    }
}
