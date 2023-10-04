package Gr9ProblemSets;

import java.util.ArrayList;
import java.util.Scanner;

public class Set2Q4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(1);

        System.out.println("Print any integer below.");
        int num = scanner.nextInt();
    
        for (int testNum = 1; testNum<num;testNum++){
            int factors = 0;
            int denominator = 1;
            while(denominator<=primeNumbers.get(primeNumbers.size()-1)){
                if(testNum%primeNumbers.get(denominator-1) == 0){
                    factors++;
                }
                denominator++;
            }
            if (factors == 1){
                System.out.print(testNum + " ");
                primeNumbers.add(testNum);
            }
        }
        scanner.close();
    }
}
