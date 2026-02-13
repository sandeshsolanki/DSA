package arrays;

public class MedianOfTwoSortedArray {

    public static double findMedian(int[] arr1, int[] arr2)
    {
        int n = arr1.length;
        int m = arr2.length;

        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        while(i < n && j < m)
        {
            if (arr1[i] < arr2[j])
            {
                merged[k++] = arr1[i++];
            }
            else
            {
                merged[k++] = arr2[j++];
            }
        }

        while(i < n)
        {
            merged[k++] = arr1[i++];
        }

        while(j < m)
        {
            merged[k++] = arr2[j++];  // FIXED
        }

        int total = m + n;

        if (total % 2 == 0) {
            return (merged[total/2 - 1] + merged[total/2]) / 2.0; // FIXED
        }
        else {
            return merged[total/2];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,45};
        int[] arr2 = {2,3,4,7,9,10};

        System.out.println(findMedian(arr1,arr2));
    }
}
