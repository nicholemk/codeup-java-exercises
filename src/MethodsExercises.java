import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
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

        System.out.println("Please enter a number!");
//        int i,fact=1;
//        int number=5;//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        double userInt = scan.nextDouble();

        if(isNegative(userInt)) {
            System.out.println("Your number is negative");
        } else if(isPositive(userInt)){
            System.out.println("Your number is positive");
        } else {
            System.out.println("your number is neither negative nor positive");
        }
    }



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

    }
//}
