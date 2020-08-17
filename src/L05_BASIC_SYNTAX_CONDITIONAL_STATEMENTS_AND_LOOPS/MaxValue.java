package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Math.max(5,8);
        int max2 = getMax(5,34);

        System.out.println(max);
        System.out.println(max2);

    }

    private static int getMax(int a, int b) {
        int max = a;
        if(a<b){
            max=b;
        }
        return max;
    }
}
