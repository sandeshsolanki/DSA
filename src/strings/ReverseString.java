package strings;

public class ReverseString {
    public static void reverseStringUsingTwoPointer(String str)
    {
        char[] arr  = str.toCharArray();

        int start = 0;
        int end = arr.length-1;

        while(start < end)
        {
            char temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(new String(arr));
    }

    public static void reverseStringUsingStringBuilder(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str = "sandesh";
        reverseStringUsingTwoPointer(str);
    }

}
