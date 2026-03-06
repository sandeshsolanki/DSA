package arrays;

public class SecondLargestBruteForce {
    public static int secondLargest(int[] arr)
    {
        int first = 0;
        int second = 0;

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] > first)
            {
                second = first;
                first = arr[i];
            } else if (arr[i] != first && arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,45};
        System.out.println(secondLargest(arr));
    }
}
