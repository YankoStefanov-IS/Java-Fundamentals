package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Random;

public class Random2 {

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println(rand.nextInt(10) + 5);
        System.out.println(rand.nextInt(10) - 5);
        System.out.println(rand.nextInt(10) + 5);
        System.out.println(rand.nextInt(10) + 5);
    }
}
