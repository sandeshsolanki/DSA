package arrays;

public class MaxSubSumBruteForce {
    public static int maxSum(int[] arr)
    {
     int maxSum = arr[0];

     for (int i=0; i< arr.length; i++)
     {
         int currentSum = 0;
         for (int j=i; j<arr.length; j++)
         {
             currentSum += arr[j];
             maxSum = Math.max(currentSum,maxSum);
         }
     }
    return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(arr));
    }
}
