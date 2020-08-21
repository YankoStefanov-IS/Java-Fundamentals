package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<Car>();
        List<Truck> trucks = new ArrayList<Truck>();
        int carsHorsepower = 0;
        int truckHorsepower= 0;

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];

            int horsepower = Integer.parseInt(tokens[3]);
            if ("car".equals(type)) {
                Car car = new Car(model, color, horsepower);
                carsHorsepower+=car.getHorsepower();
                cars.add(car);
            } else if ("truck".equals(type)) {
                Truck truck = new Truck(model, color, horsepower);
                truckHorsepower+=truck.getHorsepower();
                trucks.add(truck);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!"Close the Catalouge".equals(input)) {
            for (Car car : cars) {
                if (car.getModel().equals(input)) {
                    System.out.println(car);
                    break;
                }
            }
            for (Truck truck : trucks) {
                if(truck.getModel().equals(input)) {
                    System.out.println(truck);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        double avgCarHorsepower = carsHorsepower*1.0/cars.size();
        System.out.printf("Cars have average hourspower of %2f.%n",avgCarHorsepower);
        double avgTruckHorsepower = truckHorsepower*1.0/trucks.size();
        System.out.printf("Trucks have average horsepower of: %.2f.",avgTruckHorsepower);

    }
}
