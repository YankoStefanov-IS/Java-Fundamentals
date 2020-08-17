package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNum = Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if(dayNum>=1 && dayNum<=7){
            System.out.println(daysOfWeek[dayNum-1]);
        } else {
            System.out.println("Invalid day!!");
        }

    }
}
