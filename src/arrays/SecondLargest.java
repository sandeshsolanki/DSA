package arrays;

import java.util.Arrays;

public class SecondLargest
{
    public static int secondLargest(int[] arr)
    {


        Arrays.sort(arr);
        int n = arr.length-1;
        int largest = arr[n];
        int secondLargest = -1;

        for (int i=arr.length-2; i>=0; i--)
        {

            if (arr[i] != largest)
            {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,8,8,8,9,9,9,9,9,9,9,10,10,10};
        System.out.println(secondLargest(arr));
    }
}
