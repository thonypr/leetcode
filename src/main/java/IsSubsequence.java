import java.util.Locale;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int lastFoundPoint = -1;
        for(int i = 0; i < s.length(); i++) {
            char charToCheckFromSub = s.charAt(i);
            boolean isFound = false;
            for(int j = lastFoundPoint + 1; j < t.length(); j++) {
                char charFromText = t.charAt(j);
                if(charToCheckFromSub == charFromText) {
                    isFound = true;
                    lastFoundPoint = j;
                    break;
                }
            }
            if(!isFound)
                return false;
        }
        return true;
    }
}
