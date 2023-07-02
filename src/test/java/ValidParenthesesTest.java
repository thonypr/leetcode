import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void validParenthesesTest() {
        ValidParentheses program = new ValidParentheses();
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        String input4 = "([)]";
        String input5 = "{[]}";
        String input6 = "]";
        String input7 = "(])";
        //(])

//        Assertions.assertTrue(program.isValid(input1));
//        Assertions.assertTrue(program.isValid(input2));
//        Assertions.assertFalse(program.isValid(input3));
//        Assertions.assertFalse(program.isValid(input4));
//        Assertions.assertTrue(program.isValid(input5));
//        Assertions.assertFalse(program.isValid(input6));
        Assertions.assertFalse(program.isValid(input7));

    }
}
