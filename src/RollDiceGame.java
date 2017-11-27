public class RollDiceGame {
    public static void main(String[] args) {

        rollDiceGame(sc);

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
                } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

            } while (!userChoice.equals("n"));
        }
    }
}