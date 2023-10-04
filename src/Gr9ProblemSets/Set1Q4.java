package Gr9ProblemSets;
import java.util.Scanner;

public class Set1Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 54, 43, 5};
        boolean hasNum1 = false;
        boolean hasNum2 = false;
    
        System.out.println("Please print out the first number you want to check for");
        int num1 = scanner.nextInt();

        System.out.println("Please print out the second number you want to check for");
        int num2 = scanner.nextInt();

        for(int loop = 0;loop<numbers.length;loop++){
            if(numbers[loop]==num1){
                hasNum1 = true;
                break;
            }
        }
        for(int loop = 0;loop<numbers.length;loop++){
            if(numbers[loop]==num2){
                hasNum2 = true;
                break;
            }
        }
        if(hasNum1&&hasNum2){
            System.out.println("This array contains both "+num1+" and "+num2);
        } else if(hasNum1){
            System.out.println("This array contains "+num1);
        } else if(hasNum2){
            System.out.println("This array contains "+num2);
        } else {
            System.out.println("This array contains neither "+num1+" or "+num2);
        }
        scanner.close();
    }
}
