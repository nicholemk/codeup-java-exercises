import java.util.Scanner;

public class RollDiceGame {

    // Ask the user to enter the number of sides for a pair of dice.
    // Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        rollDiceGame(sc);
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }

        public static int randomWithRange(int min, int max)
        {
            int range = (max - min) + 1;
            return (int)(Math.random() * range) + min;
        }

        public static void rollDiceGame(Scanner sc) {
            String userChoice;
            System.out.print("Please enter the number of sides for the dice: ");
            int nSides = getInteger(1, 20);
            do {
                System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
                do {
                    System.out.println("Would you like to roll again? [y/n]");
                    userChoice = sc.next().trim();
                } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));

            } while (!userChoice.equals("n"));
        }
    }
