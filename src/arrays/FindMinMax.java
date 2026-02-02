package arrays;

public class FindMinMax {
    public static void findMinMax(int[] arr)
    {
        int max = arr[0];
        int min  = arr[0];

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }

            if (arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("the value of min : " + min);
        System.out.println("the value of max :" + max);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,34,5,6,7,8,9,145,0};
        findMinMax(arr);
    }
}
