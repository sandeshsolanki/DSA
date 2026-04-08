package arrays;
import java.util.Set;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void intersection(int[] arr1, int[] arr2)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num1 : arr1)
        {
            set1.add(num1);
        }


        for (int num2 : arr2)
        {
            if (set1.contains(num2))
            {
                result.add(num2);
            }
        }

        System.out.println(result);

    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {4,5,6,7,8};

        intersection(arr1,arr2);
    }
}
