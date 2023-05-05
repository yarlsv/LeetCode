package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;


public class MaxNumberofVowelsInASubstringOfGivenLength {

    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public int maxVowels(String s, int k) {

        int n = s.length();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
            arr[i] = count;
        }
        int max = 0;
        for (int i = 0; i <= n - k; i++) {
            int end = i + k - 1;
            if (i == 0) {
                max = Math.max(max, arr[end]);
            } else {
                max = Math.max(max, arr[end] - arr[i - 1]);
            }
        }
        return max;
    }

    @Test
    public void test() {
        Assertions.assertEquals(3, maxVowels("abciiidef", 3));
        Assertions.assertEquals(0, maxVowels("rhythms", 4));
        Assertions.assertEquals(2, maxVowels("aeiou", 2));
        Assertions.assertEquals(2, maxVowels("leetcode", 3));
    }
}
