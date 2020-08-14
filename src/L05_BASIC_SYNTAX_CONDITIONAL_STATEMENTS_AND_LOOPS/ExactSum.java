package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < count; i++) {
            double next = Double.parseDouble(scanner.nextLine());

            sum = sum.add(BigDecimal.valueOf(next));
        }

        System.out.println(sum);
    }
}
