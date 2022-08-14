package test.games;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("| Welcome |");
        System.out.println("Choose:\n 0: Rock \n 1: Paper \n 2: Scissors");
        Random random = new Random();

        int compWin = 0;
        int userWin = 0;

        for (int game = 1; game <= 5; game++) {
            System.out.println("Match " + game + ":");
            System.out.print("Your Choice: ");
            int user = sc.nextInt();
            System.out.print("Computer: ");
            int comp = random.nextInt(3);
            System.out.print(comp);
            System.out.print("\n");


            switch (comp) {
                case 0:
                    switch (user) {
                        case 0 -> System.out.println("Tie");
                        case 1 -> {
                            System.out.println("Win");
                            userWin++;
                        }
                        case 2 -> {
                            System.out.println("Lose");
                            compWin++;
                        }
                        default -> {
                            System.out.println("Invalid Input");
                            game -= 1;
                        }
                    }
                    break;
                case 1:
                    switch (user) {
                        case 0 -> {
                            System.out.println("Lose");
                            compWin++;
                        }
                        case 1 -> System.out.println("Tie");
                        case 2 -> {
                            System.out.println("Win");
                            userWin++;
                        }
                        default -> {
                            System.out.println("Invalid Input");
                            game -= 1;
                        }
                    }
                    break;
                case 2:
                    switch (user) {
                        case 0 -> {
                            System.out.println("Win");
                            userWin++;
                        }
                        case 1 -> {
                            System.out.println("Lose");
                            compWin++;
                        }
                        case 2 -> System.out.println("Tie");
                        default -> {
                            System.out.println("Invalid Input");
                            game -= 1;
                        }
                    }
                    break;
            }
            System.out.print("\n");

        }
        System.out.println("Computer wins: \"" + compWin + "\"");
        System.out.println("Your wins: \"" + userWin + "\" \n");

        System.out.println("\t~ FINAL RESULT ~");

        if (userWin == compWin) {
            System.out.println("\t\"This is a TIE\"");
        } else if (userWin > compWin) {
            System.out.println("\t\"You WON\"");
        } else {
            System.out.println("\t\"You LOST\"");
        }
        System.out.println("Thank you for plying");
    }

}