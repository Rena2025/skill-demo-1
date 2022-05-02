import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Tester {
    @Test
    public void testMultiply() {
        assertEquals("Output is 4 * 5 = 20", 9, SkillDemo1.multiply(4, 5));
    }
}
