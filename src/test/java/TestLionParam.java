import com.example.Feline;
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
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion (sex,feline);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }

}
