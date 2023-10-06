package oop;

public abstract class Report<T> {
    abstract void generateHeader();
    abstract void generateBody();
    abstract void generateFooter();
    void process2(T t) {

    }
    void process() {
        generateHeader();
        generateBody();
        generateFooter();
    }
}

abstract class ReportType2 {
    abstract void generateHeader();
    abstract void generateBody();
    void process() {
        generateHeader();
        generateBody();
    }
}
class Report1 extends Report{
    @Override
    void generateHeader() {
    }

    @Override
    void generateBody() {
    }

    @Override
    void generateFooter() {
    }
}

class XXX {}

class Main {
    public static void main(String[] args) {
        Report<XXX> report1 = new Report1();
        XXX x = new XXX();
        report1.process2(x);
    }
}
