package Gr9ProblemSets;

import java.util.ArrayList;
import java.util.Scanner;

public class Set2Q4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        System.out.println("Type in a number below");
        int number = scanner.nextInt();

        for (int i = 1; i<number;i++){
            int test = 1;
            int factors = 0;

            while (test<=i){
                if (i%test == 0){
                    factors++;
                }
                test++;
                if(factors>2){
                    break;
                }
            }

            if (factors == 2){
                primeNumbers.add(i);
                System.out.print(primeNumbers.get(primeNumbers.size()-1) + " ");
            }
        }
        scanner.close();
    }
}
