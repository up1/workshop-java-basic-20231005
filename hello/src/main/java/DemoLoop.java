import java.util.ArrayList;
import java.util.List;

public class DemoLoop {
    public static void main(String[] args) {
        // array
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        // Collection framework
        // List => Vector, ArrayList
        // Map => HashMap

        List<Integer> datas = new ArrayList<>();
        datas.add(1);
        datas.add(2);
        datas.add(3);

        for (int i = 0; i < datas.size(); i++) {
            System.out.println(datas.get(i));
        }
        for (Integer data : datas) {
            System.out.println(data);
        }
        datas.forEach(System.out::println);
        datas.stream().forEach(System.out::println);
        datas.parallelStream().forEach(System.out::println);



    }
}
