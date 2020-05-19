
import org.junit.Test;


import static org.junit.Assert.*;

public class PersonTest {

    private Person p = new Person();

    @Test
    public void personTest() {
        assertEquals("hi", p.hi());
    }

}
