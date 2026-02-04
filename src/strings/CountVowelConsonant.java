package strings;

public class CountVowelConsonant {

    public static void count(String string)
    {
        string = string.toLowerCase();
        int vowel = 0;
        int consonant = 0;
        for (int i=0; i<string.length(); i++)
        {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowel++;
            }
            else
            {
                consonant++;
            }
        }

        System.out.print("the number of vowel is : " + vowel);
        System.out.println();
        System.out.print("the number of consonant is : "+ consonant);
    }

    public static void main(String[] args) {
        String string = "education";
        count(string);
    }
}
