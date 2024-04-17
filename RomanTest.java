
import org.junit.*;
import static org.junit.Assert.*;

public class RomanTest {
    @Test
    public void simpleTest () {
        
        assertEquals("I", Roman.getRoman(1));
        assertEquals("V", Roman.getRoman(5));
        assertEquals("X", Roman.getRoman(10));
        assertEquals("L", Roman.getRoman(50));
        assertEquals("C", Roman.getRoman(100));
        assertEquals("D", Roman.getRoman(500));
        assertEquals("M", Roman.getRoman(1000));
    }
    @Test
    public void compoundTest () {
        assertEquals("CCCXXVII", Roman.getRoman(327));
        assertEquals("MDLXXVIII", Roman.getRoman(1578));
        assertEquals("CLVIII", Roman.getRoman(158));
        assertEquals("MMCCXX", Roman.getRoman(2220));
        assertEquals("CXLV", Roman.getRoman(145));
    }

}

