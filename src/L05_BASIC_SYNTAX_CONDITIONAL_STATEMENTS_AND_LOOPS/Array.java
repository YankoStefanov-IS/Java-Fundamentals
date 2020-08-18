package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(
                Arrays.asList(10,20,30,40,50,60));

        nums.remove(2);
        nums.remove(Integer.valueOf(40));
        nums.add(100);
        nums.add(0,-100);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i) + " ");
        }
    }
}
