package strings;

import java.util.Locale;

public class FirstNonRepeating {
    public static char firstOccurance(String str)
    {
        for (int i=0; i<str.length(); i++)
        {
            int count = 0;

            for (int j=0; j<str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }

            if (count == 1)
            {
                return str.charAt(i);
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        String string = "sandesh";

        System.out.println(firstOccurance(string));
    }
}
