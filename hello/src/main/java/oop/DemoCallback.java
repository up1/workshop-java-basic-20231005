package oop;

public class DemoCallback {
    public static void main(String[] args) {

    }
}

class ServiceA {
    void callB() {
        ServiceB b = new ServiceB();
        b.doSth();
    }

    void success(String result) {
    }
    void failure(String error) {
    }
}

class ServiceB {
    void doSth() {

    }
}