package strings;

public class ReverseString2 {
    public static void reverseString(String string)
    {

        String reversed = new StringBuilder(string).reverse().toString();
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        reverseString("sandesh");
    }
}
