package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS.Vehicle;

public class Car {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Car(String model, String color, int horsepower) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.type = "Car";
    }



    public int getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: Car%n" +
                        "Model: %s%n" +
                        "Color: %s%n" +
                        "Horsepower: %d",
                this.type, this.model, this.color, this.horsepower);
    }
}
