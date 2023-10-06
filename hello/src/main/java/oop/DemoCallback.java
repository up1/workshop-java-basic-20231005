package oop;

interface X {
    void a();
    void b();
    void c();
}

class Impl2 implements  X {

    @Override
    public void a() {
        // TODO
    }

    @Override
    public void b() {
        throw new RuntimeException("Under construction");
    }

    @Override
    public void c() {
        throw new RuntimeException("Under construction");
    }
}

class Impl1 implements  X{

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}

interface TaskResult {
    void success(String result);
    void failure(String error);
}

class MockServiceB extends ServiceB {
    @Override
    String doSth(TaskResult a) {
        System.out.println("MockServiceB ..");
        return "";
    }
}

public class DemoCallback {
    public static void main(String[] args) {
        // Dependency
        ServiceB b = new MockServiceB();
        // Dependency Injection (DI)
        ServiceA a = new ServiceA(); // Constructor injection
        a.setB(b);  // Setter injection
        a.callB(); // Method injection
    }
}

class ServiceA implements TaskResult {
    private ServiceB b;
    public void setB(ServiceB b) {
        this.b = b;
    }
    void callB() {
        String result = b.doSth(this);
        if(result != null) {
            // TODO
        }
    }

    @Override
    public void success(String result) {
    }

    @Override
    public void failure(String error) {
    }


}

class ServiceB {
    String doSth(TaskResult a) {
//        a.success("200");
//        a.failure("500");
//        return "";
        throw new RuntimeException("XXX");
    }
}