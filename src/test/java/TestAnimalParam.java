import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class TestAnimalParam {
    private static String type;
    private static List food;

    public TestAnimalParam(String type, List food){
        this.type = type;
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] getData(){
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Гриб", List.of()},
        };
    }

    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();
        try {
            Assert.assertEquals(animal.getFood(type), food);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

}
