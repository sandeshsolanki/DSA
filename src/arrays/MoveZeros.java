package arrays;
import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] arr)
    {
        int insertion = 0;
        for (int i=0; i< arr.length; i++)
        {
            if (arr[i] != 0)
            {
                arr[insertion++] = arr[i++];
            }

        }
        while (insertion < arr.length)
        {
            arr[insertion++] = 0;
        }

    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,0,3};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
