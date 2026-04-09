package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWORepeatingChar {
    public static int longestSubString(String string)
    {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right=0; right<string.length(); right++)
        {
            while(set.contains(string.charAt(right)))
            {
                set.remove(string.charAt(left));
                left++;
            }

            set.add(string.charAt(right));

            maxLength = Math.max(maxLength, right - left +1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubString(s)); // Output: 3
    }
}
