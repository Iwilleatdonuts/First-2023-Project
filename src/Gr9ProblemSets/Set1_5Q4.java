package Gr9ProblemSets;
import java.util.Scanner;

public class Set1_5Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 54, 43, 5, 1, 3, 4, 76, 1};
        int num1Score = 0;
        int num2Score = 0;
    
        System.out.println("Please print out the first number you want to check for");
        int num1 = scanner.nextInt();

        System.out.println("Please print out the second number you want to check for");
        int num2 = scanner.nextInt();

        for(int loop = 0;loop<numbers.length;loop++){
            if(numbers[loop]==num1){
                num1Score++;
                break;
            }
        }
        for(int loop = 0;loop<numbers.length;loop++){
            if(numbers[loop]==num2){
                num2Score++;
                break;
            }
        }
        if(num1Score>0&&num2Score>0){
            System.out.println("This array contains both "+num1+" and "+num2);
            System.out.print(num1+" appears at indices: ");
            for(int loop = 0;loop<numbers.length;loop++){
                if(numbers[loop]==num1){
                    System.out.print(loop+", ");
                }
            }
            System.out.println();
            System.out.print(num2+" appears at indices: ");
            for(int loop = 0;loop<numbers.length;loop++){
                if(numbers[loop]==num2){
                    System.out.print(loop+", ");
                }
            }
        } else if(num1Score>0){
            System.out.println("This array contains "+num1);
            System.out.print(num1+" appears at indices: ");
            for(int loop = 0;loop<numbers.length;loop++){
                if(numbers[loop]==num1){
                    System.out.print(loop+", ");
                }
            }
        } else if(num2Score>0){
            System.out.println("This array contains "+num2);
            System.out.print(num2+" appears at indices: ");
            for(int loop = 0;loop<numbers.length;loop++){
                if(numbers[loop]==num2){
                    System.out.print(loop+", ");
                }
            }
        } else {
            System.out.println("This array contains neither "+num1+" or "+num2);
        }
        scanner.close();
    }
}