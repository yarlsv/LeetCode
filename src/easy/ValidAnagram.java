package easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int i = map.get(c);
                map.put(c, ++i);
            } else {
                map.put(c, 1);
            }
        }

        for(Character c : t.toCharArray()) {
            if (map.containsKey(c)) {
                int i = map.get(c);
                if(i < 1) {
                    return false;
                }

                map.put(c, --i);


            } else {
                return false;
            }

        }

        return true;
    }
}

