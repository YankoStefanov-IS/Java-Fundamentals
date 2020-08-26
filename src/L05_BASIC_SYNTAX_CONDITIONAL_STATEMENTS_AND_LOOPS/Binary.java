package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int digit = Integer.parseInt(scanner.nextLine());

        System.out.println(Integer.SIZE);

        String binaryString = Integer.toBinaryString(number);

        System.out.println(binaryString);

        int count = 0;


        System.out.println(count);
    }
}
