package arrays;

public class ThirdLargest {
    public static int thirdLargest(int[] arr)
    {

        if (arr.length < 3)
        {
            return -1;
        }
        int first = arr[0];
        int second = arr[0];
        int third = arr[0];

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] > first)
            {
                third = second;
                second = first;
                first = arr[i];
            }

            else if(arr[i] < first && arr[i]  > second)
            {
                third = second;
                second = arr[i];
            }
            else if(arr[i] < second && arr[i] > third)
            {
                third = arr[i];
            }
        }
        return third;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,5,6,7,7,8};
        System.out.println(thirdLargest(arr));
    }
}
