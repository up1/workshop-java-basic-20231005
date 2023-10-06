class Demo2 {

    Integer data;

    void process() {
        Integer result1 = step1(data);
    }

    Integer step1(Integer d1) {
        Integer d11 = d1;
        return d11;
//        step2(d1);
    }
    void step2(Integer d2) {
        d2 = 2;
        step3(d2);
    }
    void step3(Integer d3) {
        d3 = 3;
    }

    void xx() {
        if(true) {
            if(true) {
                if(true) {
                    // process
                }
            }
        }
    }


    public static void main(String[] args) {
        DemoWrapper d1 = DemoWrapper.newInstance();
        DemoWrapper d2 = DemoWrapper.newInstance();
        System.out.println(d1);
        System.out.println(d2);


    }
}
public class DemoWrapper {
    // Singleton
    private static DemoWrapper instance = null;
    private DemoWrapper() {
    }

    public static DemoWrapper newInstance(){
        if(instance == null) {
            instance = new DemoWrapper();
        }
        return instance;
    }

    static void doSth() {

    }
}
