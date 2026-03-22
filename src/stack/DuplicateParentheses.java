package stack;

import java.util.Stack;

public class DuplicateParentheses {
    public static boolean isDuplicate(String string)
    {
        Stack<Character> stack =  new Stack<>();

        for (int i=0; i<string.length(); i++)
        {
            char ch = string.charAt(i);

            //closing
            if (ch == ')')
            {
                int count = 0;
                while (stack.peek() != '(')
                {
                    stack.pop();
                    count++;
                }

                if (count < 1)
                {
                    return true;
                }
                else
                {
                    stack.pop();
                }

            }
            else
            {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String string1 = "((a+b))";
        String string2 = "(a*b)";
        System.out.println(isDuplicate(string1));
        System.out.println(isDuplicate(string2));
    }
}
