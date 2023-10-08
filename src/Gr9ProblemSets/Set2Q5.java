package Gr9ProblemSets;

import java.util.Scanner;

public class Set2Q5 {
    public static void main(String[] args) {
        
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        
        System.out.println("Please type in the starting hour");
        int hour = intScanner.nextInt();

        if(hour>=1||hour<=12){
            System.out.println("Is it am or pm?");
            String mora = stringScanner.nextLine();

            if(mora.equals("am")){
                System.out.println("How much time has passed since "+hour+mora+"?");
                int elapsedTime = intScanner.nextInt();

                int finalTime = elapsedTime+hour;
                if(finalTime<=11){
                    System.out.println("It is now "+finalTime+mora);
                }else if(finalTime>12&&(finalTime/12)%2==1){
                    System.out.println("It is now "+finalTime%12+"pm");
                }else if(finalTime%12==0){
                    System.out.println("It is now 0"+"pm");
                }else{
                    System.out.println("It is now "+finalTime%12+"am");
                }
            }else if(mora.equals("pm")){
                System.out.println("How much time has passed since "+hour+mora+"?");
                int elapsedTime = intScanner.nextInt();

                int finalTime = elapsedTime+hour;
                if(finalTime<=11){
                    System.out.println("It is now "+finalTime+mora);
                }else if(finalTime>12&&(finalTime/12)%2==1){
                    System.out.println("It is now "+finalTime%12+"am");
                }else if(finalTime%12==0){
                    System.out.println("It is now 0"+"am");
                }else{
                    System.out.println("It is now "+finalTime%12+"pm");
                }
            }else{
                System.out.println("Invalid Input");
            }
        }else{
            System.out.println("Invalid Input");
        }
        
        intScanner.close();
        stringScanner.close();
    }
}
