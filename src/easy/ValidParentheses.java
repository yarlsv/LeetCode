package easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public boolean isValid(String s) {

        if (s == null || s.length() < 1 || s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                deque.push(c);
            }

            if (c == ')' || c == '}' || c == ']') {
                if (deque.isEmpty()) {
                    return false;
                }

                char top = deque.pop();


                if (c == ')' && top != '(') {
                    return false;
                }

                if (c == '}' && top != '{') {
                    return false;
                }

                if (c == ']' && top != '[') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return deque.isEmpty();
    }
}
