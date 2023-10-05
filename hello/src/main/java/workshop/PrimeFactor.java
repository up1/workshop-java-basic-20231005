package workshop;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    List<Integer> process(int input) {
        List<Integer> output = new ArrayList<>();
        for (int remain = input; remain > 1; remain = remain / 2) {
            output.add(2);
        }
        return output;
    }

}
