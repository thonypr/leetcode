import java.util.Arrays;
import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String alphanumlowercase = s.replaceAll("[[^a-zA-Z]&&[\\D]]", "").toLowerCase(Locale.ROOT);
        if(alphanumlowercase.length() <= 1)
            return true;
        else for (int i = 0, j = alphanumlowercase.length() - 1; i < alphanumlowercase.length() / 2; i++, j--) {
            if (alphanumlowercase.charAt(i) != alphanumlowercase.charAt(j))
                return false;
        }
        return true;
    }
}
