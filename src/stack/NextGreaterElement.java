package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreater(int[] arr)
    {
     Stack<Integer> stack = new Stack<>();
     int[] nextGreater = new int[arr.length];

     for (int i=arr.length-1; i>=0;i--)
     {
         if (!stack.isEmpty() &&arr[stack.peek()] <= arr[i])
         {
             stack.pop();
         }

         if (stack.isEmpty())
         {
             nextGreater[i] = -1;
         }
         else
         {
             nextGreater[i] = arr[stack.peek()];
         }
         stack.push(i);


     }

     for (int i=0; i<nextGreater.length; i++)
     {
         System.out.print(nextGreater[i] + " ");
     }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,10};
        nextGreater(arr);
    }
}
