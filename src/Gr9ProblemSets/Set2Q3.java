package Gr9ProblemSets;

import java.util.Scanner;

public class Set2Q3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lines should be printed?");
        int lines = scanner.nextInt();

        for(int i = 0; i <= lines; i++){
            for(int j = 0; j < i; j++){
                System.out.print("!");
            }
            System.out.println();
        }
        scanner.close();
    }
}
