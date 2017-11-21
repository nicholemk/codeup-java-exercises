import java.util.Scanner;

public class MethodsExercises {

    //methods basic arithmetic

//    public static void main(String[] args) {
//        int result = 1 + 2;
//        System.out.println(result);
//        result = result - 1;
//        System.out.println(result);
//        result = result * 2;
//        System.out.println(result);
//        result = result/2;
//        System.out.println(result);
//        result = result%1;
//        System.out.println(result);

        //methods validates user input in certain range

//        System.out.println("Please enter a number!");
//        int i,fact=1;
//        int number=5;//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a number between 1 and 10");


        //methods calculating factorial of number

//        public static int factorial( int n){
//            if (n == 0) {
//                return 1;
//            }
//            int fact = 1;
//            for (int i = 1; i <= n,i++){
//                fact *= i;
//            }
//            return fact;
//        }

//        double userInt = scan.nextDouble();
//
//        if(isNegative(userInt)) {
//            System.out.println("Your number is negative");
//        } else if(isPositive(userInt)){
//            System.out.println("Your number is positive");
//        } else {
//            System.out.println("your number is neither negative nor positive");
//        }
//    }


//        public static void count(int n) {
//            if (n <= 0) {
//                System.out.println("All done!");
//                return;
//            }
//            System.out.println(n);
//            count(n - 1);
//        }
//        public static void main(String[] args) {
//            count(10);
//        }

//    public static int getInteger(int min, int max);
//    System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);


        //dice exercise

//        while (true) {
//            int dice1=(int)(Math.random()*6+1);
//            int dice2=(int)(Math.random()*6+1);
//            int sum = dice1 + dice2;
//
//            System.out.println("Roll: total = " + sum);
//
//            if (sum==2 || sum==3 || sum==12) {
//                System.out.println("Sorry with a " + sum + " You LOSE :(");
//                break;
//            } else if(sum==7 || sum==11) {
//                System.out.println("With a " + sum + " You WIN!!!!!!!");
//                break;
//            }
//
//            // If you wanted, you could wait here for the user to confirm (e.g. with a key press)
//        }
//
//    }
//}


//methods exercise from class demo

//import java.util.Scanner;

//public class MethodsExercises {
//    public static void main(String[] args) {
//
//        System.out.println("Let's make a loop!");
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("What is your starting number?");
//
//        int start = scan.nextInt();
//
//        System.out.print("What is your ending number?");
//
//        int end = scan.nextInt();
//
//        int incrementer;
//
//        do {
//            // run the code inside the do body at least ONCE
//            System.out.print("Enter an integer greater than 0 to count by");
//            incrementer = scan.nextInt();
//        } while(incrementer <= 0);
//
//        if(start < end) {
//            // for(starting number; condition to enter the loop; incrementer)
//            for(int i = start; i <= end; i += incrementer) {
//                System.out.println(i);
//            }
//        } else {
//            for(int i = start; i >= end; i -= incrementer) {
//                System.out.println(i);
//            }
//
//        }
//
//


 public class CompareValues {
     public static void main(String[] args) {
                     int x = 0;
                     while (x++ < 10) {}
                     String message = x > 10 ? "Greater than" : false;
                     System.out.println(message + ", " + x);
                 }
        }
    }
//}
