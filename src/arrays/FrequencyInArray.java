package arrays;

import java.util.HashMap;

public class FrequencyInArray {
    public static void frequency(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr)
        {
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,1,2,3,4,1,2,3,4,7};
        frequency(arr);
    }
}
