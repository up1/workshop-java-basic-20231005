package workshop.oop;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String say(int input) {
        List<MyRule> rules = new ArrayList<>();
        rules.add(new FizzBuzzRule());
        rules.add(new FizzRule());
        rules.add(new BuzzRule());
        rules.add(new SCBRule());

        for (MyRule rule : rules) {
            if(rule.check(input)) {
                return rule.say();
            }
        }

        return "" + input;
    }

}

interface MyRule {
    boolean check(int input);
    String say();
}

class FizzBuzzRule implements MyRule{

    @Override
    public boolean check(int input) {
        return input % 15 == 0;
    }

    @Override
    public String say() {
        return "FizzBuzz";
    }
}

class FizzRule implements MyRule{

    @Override
    public boolean check(int input) {
        return input % 3 == 0;
    }

    @Override
    public String say() {
        return "Fizz";
    }
}

class BuzzRule implements MyRule{

    @Override
    public boolean check(int input) {
        return input % 5 == 0;
    }

    @Override
    public String say() {
        return "Buzz";
    }
}

class SCBRule implements MyRule{

    @Override
    public boolean check(int input) {
        return input % 7 == 0;
    }

    @Override
    public String say() {
        return "SCB";
    }
}
