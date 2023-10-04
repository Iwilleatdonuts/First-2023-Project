package Gr9ProblemSets;

public class Set2Q1 {
    public static void main(String[] args) {
        
        int[] numbers = {3, 6, 3, 432, 93, -7, 4};
        int lowestNumber = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length;i++){
            if(numbers[i]<lowestNumber){
                lowestNumber = numbers[i];
            }
        }

        System.out.println("The lowest number in this array is "+lowestNumber);
    }
}
