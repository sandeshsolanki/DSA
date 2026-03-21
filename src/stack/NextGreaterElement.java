package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreater(int[] arr)
    {
      Stack<Integer> stack = new Stack<>();
      int[] nextgreater = new int[arr.length];

      for (int i=arr.length-1; i>=0; i--)
      {
          //is loop ko tab tak chalayenge jab tak ya to stack khali nahi hota yaa fr stack ka jo peek
          //element hai vo chhota  ya barabar na ho arr[i] se
          while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
          {
              stack.pop();
          }

          if (stack.isEmpty())
          {
             nextgreater[i] = -1;
          }
          else
          {
              nextgreater[i] = arr[stack.peek()];
          }
          stack.push(i);
      }

      for (int i=0; i<nextgreater.length; i++)
      {
          System.out.print(nextgreater[i] + " ");
      }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,10};
        nextGreater(arr);
    }
}
