import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {

    @Test
    public void addBinaryTest(){
        AddBinary program = new AddBinary();
        assertEquals("100", program.addBinary("11", "1"));
        assertEquals("10101", program.addBinary("1010", "1011"));
        assertEquals("1000", program.addBinary("1", "111"));
        assertEquals("11110", program.addBinary("1111", "1111"));
    }
}
