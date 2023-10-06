package workshop.oop;

import java.util.Random;

public class IdGeneratorService {

    public String process() {
        String result = "Hello ";
        Random random = new Random();
        return result + random.nextInt(10);
    }

}
