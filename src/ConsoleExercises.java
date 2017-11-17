//user enters a string

//import java.util.Scanner;
//
//public class ConsoleExercises {
//
//    public static void main(String[] args) {
//        String userInput;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        userInput = sc.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//    }
//}

//
//
////user enters an integer
//
//import java.util.Scanner;
//
//public class ConsoleExercises {
//    public static void main(Integer[] args) {
//        Integer userInput;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        userInput = sc.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//    }
//
//}
//
////user enters three words
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int userInt = sc.nextInt();
//
//        System.out.printf("You entered %d%n", userInt);
//
//        System.out.print("Please enter two words: ");
//        String first, second;
//        first = sc.nextLine();
//        second = sc.nextLine();
//
//        System.out.println("first word: " + first + "\nsecond word: " + second);
//
//
//        // total example user input a user will enter throughout the execution of the above
//        String totalExampleUserInput = "5\none\ntwo\n";
//
//        // nextInt() or next() just takes the 5...
//        int resultOfNextInt = 5;
//        // leaving...
//        String afterNextInt = "\none\ntwo\n";
//
//        // first nextLine() takes the new line character only
//        String resultOfFirstNextLine = "\n";
//        // leaving...
//        String afterfirstNextLine = "one\ntwo\n"; // storing only a seemingly empty string
//
//        // second nextLine() takes the one and new line character
//        String resultOfSecondNextLine = "one\n";
//        // leaving...
//        String aftersecondNextLine = "two\n";
//}
//
//

import java.util.Scanner;

public class ConsoleExercises{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        int userInt = sc.nextInt();
//        System.out.println(userInt);
//
//        System.out.println("Please enter three words ");
//        String firstWord, secondWord, thirdWord;
//
//        firstWord = sc.next();
//        secondWord = sc.next();
//        thirdWord = sc.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);
//
//        System.out.println("Enter a sentence");
//        String sentence = sc.next();
//        System.out.println(sentence);

        //room problem

        System.out.println("Please enter the room length");
        String lengthString = sc.nextLine();
        System.out.println(lengthString);

        double length = Double.parseDouble(lengthString);

        System.out.println(length);

        System.out.println("Please enter the room width");
        String widthString = sc.nextLine();
        System.out.println(widthString);

        double width = Double.parseDouble(widthString);

        System.out.println(width);

        double area = width * length;
        double perimeter = width * 2 + length * 2;

        System.out.println(area);

        System.out.println(perimeter);

        System.out.printf("area = %f x %f\n", length, width);
        System.out.printf("perimeter = 2 + %f + 2 x %f\n", length, width);

    }
}