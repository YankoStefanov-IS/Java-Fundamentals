package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = readIntList(scanner);
        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");
            if ("Add".equals(tokens[0])) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            } else {
                int peopleToAdd = Integer.parseInt(tokens[0]);

                for (int i = 0; i < train.size(); i++) {

                    int sum = train.get(i) + peopleToAdd;
                    if (train.get(i) + peopleToAdd <= capacity) {
                        train.set(i, sum);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        printTrain(train);

    }

    private static void printTrain(List<Integer> train) {
    }

    private static List<Integer> readIntList(Scanner scanner) {
        List<Integer> train = new ArrayList<Integer>();
        String[] input = scanner.nextLine().split(" ");

        for (String s : input) {
            train.add(Integer.parseInt(s));
        }
        return train;
    }
}
