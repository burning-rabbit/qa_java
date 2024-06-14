import com.example.Animal;
import org.junit.Test;

public class TestAnimalException {

    @Test(expected = Exception.class)
    public void testException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Гриб");
    }
}
