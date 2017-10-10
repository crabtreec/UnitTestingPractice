import com.theironyard.Main;
import org.junit.Test;
import static org.junit.Assert.*;


public class GenericTest {

    @Test
    public void isEvenTest() {
        System.out.println("Running isEvenTest");

        System.out.println("Testing Even Number");
        assertTrue(Main.isEven(2));

        System.out.println("Testing Odd Number");
        assertFalse(Main.isEven(3));


    }
}
