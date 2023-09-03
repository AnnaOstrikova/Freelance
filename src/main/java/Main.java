import ru.netology.services.CalculateService;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CalculateService service = new CalculateService ();
        int count = service.calculate(100_000,60_000,150_000);
        System.out.println(count);
    }
}