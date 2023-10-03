package Gr9ProblemSets;
import java.util.Scanner;

public class Set1_5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please print out the radius of the sphere below");
        double radius = scanner.nextDouble();

        double area = (radius*radius*radius*3.14*4)/3;

        System.out.println("The volume of the sphere with the radius of "+radius+" is "+area);

        scanner.close();
    }
}