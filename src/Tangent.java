import java.lang.Math;import java.util.Scanner;

public class Tangent{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How far is the piece?");
        double length=scanner.nextDouble();

        System.out.println("How tall is the motor?");
        double height=scanner.nextDouble();

        double value=Math.atan(length/height);
        System.out.println(value);
        System.out.println(Math.toDegrees(value));

        scanner.close();
    }
}