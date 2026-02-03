package searching_sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end)
    {
       if (start >= end)
       {
           return;
       }

            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);  // left half
            mergeSort(arr, mid + 1, end); // right half

            merge(arr, start, mid, end);



    }

    public static void merge(int[] arr, int start, int mid, int end)
    {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;


        while (i<=mid && j<=end)
        {
            if (arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            }

            else
            {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid)
        {
            temp[k++] = arr[i++];
        }
        while (j <=end)
        {
            temp[k++] = arr[j++];
        }


        for (int p = 0; p < temp.length; p++) {
            arr[start + p] = temp[p];
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,7,9,1,3,56,98,12,32};
        mergeSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
