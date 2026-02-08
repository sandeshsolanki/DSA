package strings;

public class FirstNonRepeating {
    public static int firstOccurance(String str)
    {
        char[] arr = str.toCharArray();

        for (int i=0; i<arr.length; i++)
        {
            boolean isUnique = true;
            for (int j=0; j<arr.length; j++)
            {

                if (i!=j && arr[i] == arr[j])
                {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String string = "sandesh";

        System.out.println(firstOccurance(string));
    }
}
