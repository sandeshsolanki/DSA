package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {

    public static int[] removeDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int n : arr) {
            set.add(n);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int n : set) {
            result[index++] = n;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,4,4,4,4};
       int[] unique =  removeDuplicate(arr);
        System.out.println(Arrays.toString(unique));
    }
}
