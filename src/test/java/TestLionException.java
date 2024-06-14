import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class TestLionException {
    @Test(expected = Exception.class)
    public void testException() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Гриб", feline);
    }
}
