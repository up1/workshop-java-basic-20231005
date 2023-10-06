package oop;

public class DemoCallback {
    public static void main(String[] args) {

    }
}

interface TaskResult {
    void success(String result);
    void failure(String error);
}

class ServiceA implements TaskResult {
    void callB() {
        ServiceB b = new ServiceB();
        b.doSth(this);
    }

    @Override
    public void success(String result) {
    }

    @Override
    public void failure(String error) {
    }
}

class ServiceB {
    void doSth(TaskResult a) {
        a.success("200");
        a.failure("500");
    }
}