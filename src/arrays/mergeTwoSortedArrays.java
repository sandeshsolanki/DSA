package arrays;

public class mergeTwoSortedArrays
{
    public static int[] mergeTwoArrays(int[] arr1, int[] arr2)
    {
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[m + n];
        int i = 0;
        int j = 0;
        int k=0;

        while (i < n && j < m)
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

        while (i < n)
        {
            merged[k++] = arr1[i++];
        }
        while (j < m)
        {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};

        int[] arr2 = {8,9,10,11};

        int[] result = mergeTwoArrays(arr1,arr2);

        for (int n : result)
        {
            System.out.print(n + " ");
        }
    }
}
