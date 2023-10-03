package Gr9ProblemSets;
import java.util.Scanner;

public class Set1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print out any single digit number in word form below");

        String number = scanner.nextLine();

        switch(number){
            case "one":
            System.out.println("zero");
            break;
            
            case "two":
            System.out.println("one, zero");
            break;

            case "three":
            System.out.println("two, one, zero");
            break;

            case "four":
            System.out.println("three, two, one, zero");
            break;
            
            case "five":
            System.out.println("four, three, two one, zero");
            break;

            case "six":
            System.out.println("five, four, three, two, one, zero");
            break;

            case "seven":
            System.out.println("six, five, four, three, two, one, zero");
            break;
            
            case "eight":
            System.out.println("seven, six, five, four, three, two one, zero");
            break;

            case "nine":
            System.out.println("eight, seven, six, five, four, three, two, one, zero");
            break;

            default:
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
}
