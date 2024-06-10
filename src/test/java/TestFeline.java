import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {
    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void testGetKittensInt() {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getKittens(1), 1);
    }

    @Test
    public void testGetKittens(){
        Feline feline = new Feline();
        int result = feline.getKittens();
        int actual = 1;
        Assert.assertEquals(result, actual);
    }

    @Mock
    Animal animal;

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        Mockito.when(animal.getFood("Хищник")).
                thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(feline.eatMeat(), actual);
    }

}
