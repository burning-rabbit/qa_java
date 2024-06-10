import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    Feline feline;
    @Mock
    Animal animal;

    @Test
    public void testGetKittens() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(lion.getKittens(), 1);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(animal);
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(lion.getFood(), actual);
    }
}
