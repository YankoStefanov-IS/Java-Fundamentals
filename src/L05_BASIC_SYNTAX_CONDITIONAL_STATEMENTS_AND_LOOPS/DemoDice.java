package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

public class DemoDice {

    public static void main(String[] args) {
        Dice dice = new Dice();
        Dice d2 = new Dice();

        System.out.println(dice.getSides());
        dice.setSides(20);
        d2.setSides(10);

        System.out.println(dice.roll());
        System.out.println(d2.roll());

    }
}
