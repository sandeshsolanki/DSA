package arrays;

public class MaxCircularSubArray {
    public static int maxCircularSubArray(int[] arr)
    {
        int totalSum = 0;
        int maxSum = arr[0];
        int currentMax = 0;

        int minSum = arr[0];
        int currentMin = 0;


        for (int i=0; i<arr.length; i++)
        {
            totalSum += arr[i];


            //kadane for max sub array
            currentMax = Math.max(currentMax + arr[i], currentMax);
            maxSum = Math.max(maxSum,currentMax);


            //kadane for min sub array
            currentMin = Math.min(currentMin + arr[i], currentMin);
            minSum = Math.min(minSum,currentMin);
        }

        // Edge case: all numbers are negative
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }


    public static void main(String[] args) {
        int[] arr = {5, -3, 5};
        System.out.println(maxCircularSubArray(arr)); // 10
    }
}
