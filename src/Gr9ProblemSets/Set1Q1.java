package Gr9ProblemSets;
import java.util.Scanner;

public class Set1Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print out any number below");
        double number = scanner.nextDouble();

        if(number<5){
            System.out.println("This number is less than 5");
        } else if (number>10){
            System.out.println("This number is greater than 10");
        } else {
            System.out.println("This number is between 5 and 10 inclusive");
        }
        
        scanner.close();
    }

    
}
