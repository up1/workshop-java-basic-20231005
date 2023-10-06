class Demo2 {
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
