package arrays;

public class FindMissingNumber {
    public static int missing(int[] arr, int k)
    {
        int n = arr.length-1;
        int expectedSum = k * (k+1)/2;
        int actualSum = 0;

        for (int i=0; i<=n; i++)
        {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int k = 7;
        System.out.println(missing(arr,k));
    }
}
