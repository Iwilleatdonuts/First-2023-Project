package Gr9ProblemSets;
import java.util.Scanner;

public class Set1_5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please print out a number below to be checked");
        int number = scanner.nextInt();

        if(number%7==0&&number%4==0){
            System.out.println("This number is divisible by both 4 and 7");
        } else if (number%7==0){
            System.out.println("This number is divisible by 7");
        } else if (number%4==0){
            System.out.println("This number is divisible by 4");
        } else {
            System.out.println("This number is not divisible by 4 or 7");
        }
        scanner.close();
    }
}