public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        String result = hello.sayHi("somkiat");
        System.out.println(result);
    }

    String sayHi(String name) {
        if ("x".equals(name)) {
            return "New req";
        }
        Demo demo = new Demo();
        demo.doSth();
        return "Hello, " + name;
    }
}

class Demo {
    void doSth() {
        // TODO :: next
    }
}
