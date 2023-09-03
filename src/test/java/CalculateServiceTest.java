import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.CalculateService;

public class CalculateServiceTest {
    @Test
    public void testOne () {
        CalculateService service = new CalculateService ();
        int expected = 3; // ожидаемый результат
        int actual = service.calculate(10_000,3_000,20_000);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testTwo () {
        CalculateService service = new CalculateService ();
        int expected = 2; // ожидаемый результат
        int actual = service.calculate(100_000,60_000,150_000);
        Assertions.assertEquals(expected, actual);
    }
}
