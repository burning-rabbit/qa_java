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
        };
    }
    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(food, animal.getFood(type));
    }

}
