package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        String name = "Pesho";

        names.add(name);

        if(names.contains("Pesho")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}