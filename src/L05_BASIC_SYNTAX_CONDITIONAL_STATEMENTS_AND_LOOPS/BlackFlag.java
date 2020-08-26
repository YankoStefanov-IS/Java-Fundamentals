package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysToPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());

        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double plunderToThisMoment = 0;
        for (int i = 1; i < dailyPlunder; i++) {
            plunderToThisMoment += daysToPlunder;
            if (i % 3 == 0) {
                plunderToThisMoment += 0.5 * dailyPlunder;
            }
            if(i %5 == 0) {
                plunderToThisMoment = 0.7*plunderToThisMoment;
            }
        }
        if (plunderToThisMoment >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained", plunderToThisMoment);
        } else {
            double percentOfTotalPlunder = (plunderToThisMoment/expectedPlunder)*100;
            System.out.printf("Colected only %.2f%% of the plunder", percentOfTotalPlunder);
        }
    }
}
