package Gr9ProblemSets;

import java.util.Scanner;

public class Set2Q2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Munday", "Toesday", "Wendsday", "Turdsday", "Friesday", "Saturdsday", "Sunnyday"};
        
        while(true){
            System.out.println("Please print out an integer from 1-7 inclusive below.");
            int num = scanner.nextInt();
            if(num>0&&num<8){
                System.out.println(days[num-1]);
                break;
            }
            System.out.println("Invalid Input. Please try again.");
        }
        scanner.close();
    }
}
