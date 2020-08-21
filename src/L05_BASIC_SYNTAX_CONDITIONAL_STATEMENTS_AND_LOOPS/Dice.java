package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Random;

public class Dice {
    private int sides;

    public int getSides() {
        return this.sides;
    }

    public void setSides(int side) {
        this.sides = sides;
    }

    public int roll() {
        Random rand = new Random();

        return rand.nextInt(this.sides)+1;
    }
}

