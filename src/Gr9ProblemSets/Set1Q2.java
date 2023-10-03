package Gr9ProblemSets;
import java.util.Scanner;

public class Set1Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print out the radius of the circle below");
        double radius = scanner.nextDouble();

        double area = radius*radius*3.14;
        System.out.println("The area of your circle is approximately " + area);

        scanner.close();
    }
}
