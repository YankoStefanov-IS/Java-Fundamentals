package L05_BASIC_SYNTAX_CONDITIONAL_STATEMENTS_AND_LOOPS;

import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        double grade = Double.parseDouble(scanner.nextLine());
        
        printGrade(grade);
    }

    private static void printGrade(double grade) {
        String gradeName = "";
        if(grade>=2&& grade<3) {
            gradeName = "Fail";
        } else if(grade>=3&& grade<3.5){
            gradeName = "Poor";
        }else if(grade>=3.5&& grade<4.5){
            gradeName = "Good";
        }else if(grade>=4.5&& grade<5.5){
            gradeName = "Very good";
        }else if(grade>=5.5&& grade<6){
            gradeName = "Exellent";
        }

        System.out.println(gradeName);
    }
}
