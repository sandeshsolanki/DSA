package strings;


import java.util.*;

public class NonRepeatingUsingHashMap {
    public static void nonRepeating(String str)
    {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c : map.keySet())
        {
            if (map.get(c) == 1)
            {
                System.out.println(c);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabbcdde";
        nonRepeating(str);
    }

}
