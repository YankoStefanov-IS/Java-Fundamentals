package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.ArrayList;
import java.util.List;

public class DemoArray {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();

        System.out.println(strings.size());

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        strings.set(0, "Yanko");

        System.out.println(strings.size());

        System.out.println(strings.get(0));

        strings.remove(2);

        strings.remove("Second");

        System.out.println(strings.size());

        System.out.println(String.join(", ", strings));

        List<Integer> numbers = new ArrayList<Integer>();

    }
}
