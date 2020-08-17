package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Scanner;

public class SmallestOfThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        printSmallestOfThreeNumbers(first, second, third);
    }

    private static void printSmallestOfThreeNumbers(int a, int b, int c) {
        int smallest = a;
        if (a > b) {
            smallest = b;
        }

        if (b > c) {
            smallest = c;
        }

        System.out.println(smallest);
    }
}
