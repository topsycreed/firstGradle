import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTests {

    @Test
    void firstTest() {
        System.out.println(1);

        Assertions.assertEquals(2, 1 + 1);
    }
}
