public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        String result = hello.sayHi("somkiat");
        System.out.println(result);
    }

    String sayHi(String name) {
        if("x".endsWith(name)) {
            return "New req";
        }
        return "Hello, " + name;
    }
}

class Demo {
    void doSth() {
        Hello hello = new Hello();
        hello.sayHi("somkiat 2");
    }
}
