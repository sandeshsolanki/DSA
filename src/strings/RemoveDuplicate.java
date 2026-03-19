package strings;

public class RemoveDuplicate {
    public static void removeDuplicate(String string)
    {
        string = string.toLowerCase();
        String result = " ";

        for (int i=0; i<string.length(); i++)
        {
            char ch = string.charAt(i);

            if (result.indexOf(ch) == -1)
            {
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String string = "pRogramming";
        removeDuplicate(string);
    }
}
