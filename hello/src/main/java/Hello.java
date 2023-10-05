public class Hello {
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
