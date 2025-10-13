import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void addsTwoNumbers() {
        assertEquals(5, App.add(2, 3));
    }
}
