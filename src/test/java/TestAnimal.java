import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;



public class TestAnimal {

    @Test
    public void testGetFamily(){
        Animal animal = new Animal();
        Assert.assertEquals(animal.getFamily(),
                "Существует несколько семейств: заячьи, беличьи," +
                        " мышиные, кошачьи, псовые, медвежьи, куньи");
    }

}
