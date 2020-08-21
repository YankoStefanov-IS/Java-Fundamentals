package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectCreate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = new ArrayList<String>();
        List<Integer> integers = new ArrayList<Integer>();
        List<String> stringList = new ArrayList<String>();

        strings.add("First");

        integers.add(12); 

        stringList.add("Second");

        System.out.println(strings);
    }
}
