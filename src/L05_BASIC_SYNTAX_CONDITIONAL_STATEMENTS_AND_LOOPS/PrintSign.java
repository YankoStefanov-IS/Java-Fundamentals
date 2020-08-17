package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Scanner;

public class PrintSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printSign(num);
    }

    private static void printSign(int number) {
        String sign = "zero";
        if (number > 0) {
            sign = "positive";
        } else if (number < 0) {
            sign = "negative";
        }

        String output = String.format("The number %d is %s", number, sign);
        System.out.println(output);

    }
}
