import java.util.Scanner;
import java.util.ArrayList;

public class RustyQCode {
    static Scanner scanner = new Scanner(System.in);
    static int Age = 0;
    static int Knowledge = 0;
    static boolean Live = true;
    static String Choice;
    static int QuarterYears = 0;
    static int MentalHealth = 100;
    static int PhysicalHealth = 100;
    static int Finance = 0;
    public static void main(String[] args) {
        while (Live == true){
            Knowledge = Knowledge + 1;
            QuarterYears = QuarterYears + 1;
            if (QuarterYears == 4){
                Age = Age + 1;
                QuarterYears = 0;
                System.out.println("You are now " + Age + " Years old");
                }
                System.out.println("What would you like to do?");
                Choice = scanner.nextLine();
                switch (Choice) {
            case "Take a vacation":
                System.out.println("You took a long vacation and had a good time");
            break;
            if (Age <= 3){
                    case "Talk":
                    System.out.println("You tried but nothing intelligeble came out.");
                        break;
                    case "Walk":
                    System.out.println("Your muscles are not developed enough");
                        break;
                    default:
                    System.out.println("You tried but fell asleep");
                        break;
                } 
                if (Age > 3 && Age < 14) {
                case "Go to school":
                    System.out.println("You went to school and learned");
                Knowledge = Knowledge + 5;
                break;
                    case "Skip school":
                String[] SkipSchoolList = {"You pretended to be sick", "You hid in the closet until your parents left", "You pretended to die", "You got caught by your parents and were forced to go to school"};
                System.out.println(SkipSchoolList[(int)Math.floor(Math.random() * (4 - 1 + 1) + min);]);
                break;
                default:
                System.out.println("You were forced to go to school by your parents");
                Knowledge = Knowledge + 3;
                break;
            }
            if (Age >= 14 && Age <= 18) {
                case "Go to school":
                    System.out.println("You went to school and learned")
                    Knowledge = Knowledge + 10;
                    MentalHealth = MentalHealth - 5;
                case "Skip school":
                    if ((int)Math.floor(Math.random() * (3 - 1 + 1) + min); != 1) {
                    System.out.println("You successfully skipped school and hung out with friends");
                    }
                    else {
                        System.out.println("You got caught and sent to detention");
                    }
                break;
                default:
                    System.out.println("You tried but failed miserably");
                break;
            if (Age > 18 && Age <= 60) {
                
            }
                if (Age > 60){
                       System.out.println("You're retired and live a happy life");             
                }
         }
            
    }
}
    }
}