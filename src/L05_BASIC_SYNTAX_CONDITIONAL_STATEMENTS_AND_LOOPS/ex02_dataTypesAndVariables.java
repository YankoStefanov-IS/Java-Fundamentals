package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Scanner;

public class ex02_dataTypesAndVariables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pounds = Integer.parseInt(scanner.nextLine());

        float f = 1.31F;

        double poundToDollarCourse = 1.31;
        System.out.printf("%.3f", pounds*poundToDollarCourse);
    }
}
