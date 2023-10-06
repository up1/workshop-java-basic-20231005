package workshop.oop;

import java.util.Random;

public class IdGeneratorService {

    private Random random;

    public void setRandom(Random random) {
        this.random = random;
    }

    public String process() {
        String result = "Hello ";
//        Random random = new Random();
        return result + random.nextInt(10);
    }

    private int doSth() {
        return 1;
    }

}
