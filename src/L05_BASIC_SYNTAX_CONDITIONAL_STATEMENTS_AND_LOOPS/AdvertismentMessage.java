package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Random;
import java.util.Scanner;

public class AdvertismentMessage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] phrases = new String[]{"Exellent product", "It's amazing", "Be the best", "Keep moving foward"};
        String[] events = new String[]{"Now I feel good"};
        String[] authors = new String[]{"Diana", "Petya"};
        String[] cities = new String[]{"Burgas", "Varna", "Sofia"};

        int n = Integer.parseInt(scanner.nextLine());

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            String phrase = phrases[random.nextInt(phrases.length)];
            String event = events[random.nextInt(events.length)];
            String author = authors[random.nextInt(authors.length)];
            String city = cities[random.nextInt(cities.length)];

            String result = String.format("%s %s %s -%s", phrase, event, author, city);
            System.out.println(result);
        }
    }
}
