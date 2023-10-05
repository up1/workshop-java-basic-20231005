package workshop;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    List<Integer> process(int input) {
        List<Integer> output = new ArrayList<>();
        int remain = input;
        while(remain > 1) {
            output.add(2);
            remain = remain / 2;
        }
        return output;
    }

}
