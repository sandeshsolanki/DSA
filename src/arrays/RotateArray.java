package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void rotateArray(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;

        rotate(arr,0,n-1);
        rotate(arr,0, k-1);
        rotate(arr,k,n-1);
    }

    public static void rotate(int[] arr, int start, int end)
    {
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        System.out.println(Arrays.toString(arr) + " ");
        rotateArray(arr,k);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
