package stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String string)
    {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<string.length();i++){
                char ch = string.charAt(i);
            // If opening bracket → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If all closing bracket
            else {
                if (stack.isEmpty())
                {
                    return false;
                }



                // Check matching
                 if( (stack.peek() == '(' && ch == ')' ) ||
                         (stack.peek() == '{' && ch == '}')||
                         (stack.peek() == '[' && ch == ']'))
                 {
                     stack.pop();
                }
                 else
                 {
                     return false;
                 }
            }
        }

        // If stack empty → valid
        if (stack.isEmpty())
        {
            return true;
        }

        else
        {
            return false;
        }
    }





    public static void main(String[] args) {
        String string = "(]";
        String string1 = "({[]})";

        System.out.println(isValid(string));
        System.out.println(isValid(string1));
    }
}
