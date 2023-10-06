package oop;

public abstract class Report {
    abstract void generateHeader();
    abstract void generateBody();
    abstract void generateFooter();
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

class Main {
    public static void main(String[] args) {
        Report report1 = new Report1();
        report1.process();
    }
}
