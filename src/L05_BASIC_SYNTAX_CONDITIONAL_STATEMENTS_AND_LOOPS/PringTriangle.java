package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Scanner;

public class PringTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLineNumber = Integer.parseInt(scanner.nextLine());

        printTiangle(maxLineNumber);
    }

    private static void printTiangle(int maxLineNumber) {
        printTopHalf(maxLineNumber);
        printBottomHalf(maxLineNumber-1);
    }


    private static void printTopHalf(int numberOfRows) {
        for (int i = 0; i <= numberOfRows; i++) {
            printRow(1,i);
            System.out.println();
        }
    }

    private static void printBottomHalf(int longestLine) {
        for (int i = longestLine; i >0 ; i--) {
            printRow(1,i);
            System.out.println();
        }
    }

    private static void printRow(int from, int to) {
        for (int i = from; i <=to; i++) {
            System.out.print(i+" ");
        }
    }
}
