package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

public class methods {
    public static void main(String[] args) {
        printSum(3,9);

        printPlusFive(5);
    }

    private static void printSum(int first, int second) {
        System.out.println(first+second);
    }

    private static void printPlusFive(int num){
        int five = 5;

        System.out.println(num+five);
    }
}
