import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<String> line = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                line.push(String.valueOf(c));
            }
            else {
                if (line.isEmpty())
                    return false;
                if (c == ']' && Objects.equals(line.peek(), String.valueOf('[')) ||
                        c == '}' && Objects.equals(line.peek(), String.valueOf('{')) ||
                        c == ')' && Objects.equals(line.peek(), String.valueOf('('))
                ) {
                    line.pop();
                }
                else {
                    return false;
                }
            }
        }
        return line.isEmpty();
    }
}
