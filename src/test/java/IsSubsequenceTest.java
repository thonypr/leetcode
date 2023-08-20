import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    @Test
    public void isSubsequenceTest(){
        IsSubsequence program = new IsSubsequence();
        Assertions.assertTrue(program.isSubsequence("abc", "ahbgdc"));
        Assertions.assertFalse(program.isSubsequence("axc", "ahbgdc"));
    }
}
