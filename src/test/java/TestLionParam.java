import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class TestLionParam {
    private static String sex;
    private static boolean hasMane;

    public TestLionParam(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getData(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Гриб", false},
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        try {
            Lion lion = new Lion (sex);
            Assert.assertEquals(lion.doesHaveMane(), hasMane);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "Используйте допустимые значения пола животного - самей или самка");
        }
    }

}
