package arrays;

import java.util.Arrays;

public class RemoveDuplicateBruteForce {
    public static int[] removeDuplicate(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[index++] = arr[i];
            }
        }

        // add last element
        temp[index++] = arr[n - 1];

        // exact size array
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,3,4,5,6,6};
        int[] uni = removeDuplicate(arr);
        System.out.print(Arrays.toString(uni));
    }
}
