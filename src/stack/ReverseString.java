package stack;

import java.util.Stack;

public class ReverseString {
    public static void reverseString(String string)
    {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<string.length(); i++)
        {
            stack.push(string.charAt(i));
        }


        String reverse = " ";
        while (!stack.isEmpty())
        {
            reverse += stack.pop();
        }
        System.out.println("reverse string  = " + reverse);
    }

    public static void main(String[] args) {

        String string = "sandesh";
        reverseString(string);
    }
}
