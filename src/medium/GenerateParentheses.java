package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, 0, 0, "", n);

        return result;
    }

    private void generate(List<String> result, int left, int right, String str, int n) {
        if (str.length() == n * 2) {
            result.add(str);
            return;
        }

        if (left < n) {
            generate(result, left + 1, right, str + "(", n);
        }

        if (right < left) {
            generate(result, left, right + 1, str + ")", n);
        }
    }
}
