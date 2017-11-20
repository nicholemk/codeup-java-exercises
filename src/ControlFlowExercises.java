//import java.util.Scanner;
//
//public class ControlFlowExercises {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("What is your starting numbeR?");
//        int start = scan.nextInt();
//
//        System.out.println("What is your ending number?");
//        int end = scan.nextInt();
//
////        System.out.println("What do you want to increase by each time?");
////        int incrementer = scan.nextInt();
//
//        int incrementer;
//
//        do{
//            System.out.println("Enter an integer greater than 0 to count by");
//            incrementer = scan.nextInt();
//        } while(incrementer <= 0);
//
////        if incrementer == 0) {
////            System.out.println("Please enter an incrementer greater than 0");
////            incrementer = scan.nextInt();
////        } else {
//
//        if(start < end) {
//            for(int i = start; i <= end; i += incrementer) {
//                System.out.println(i);
//            }
//
//        } else {
//            for(int i = end; i > start; i -= incrementer) {
//                System.out.println(i);
//            }
//        }
//    }
//}
//
////        multiples of 3 print fizz
////        multiples of 5 print buzz
////        multiples of both print fizzbuzz
//
//public class ControlFlowExercises {
//
//            public static void main(String[] args) {
//                {
//                    String buzz = "buzz", fizz = "fizz"; //initialise the string variables
//                    for (int i = 1; i <= 100; i++) {
//                        if (i % 15 == 0) //check if number in position i is divisable by 15, if so don't check other 2 conditions - we don't want a double print
//                        {
//                            System.out.println(" " + i + "fizzbuzz");
//                        } else if (i % 3 == 0) {
//                            System.out.println(" " + i + "buzz");
//                        } else if (i % 5 == 0) {
//                            System.out.println(" " + i + "fizz");
//                        }
//                    }
//                }
//            }
//        }
//


//public class ControlFlowExercises {
//    public static void main(String[] args) {
//                System.out.println("Enter an integer");
//                System.out.printf("Member '%s' ----- #%i", firstName, memberID);
//    }
//}


import java.util.Scanner;

//public class ControlFlowExercises{
//    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i);
//            System.out.print(" ");
//            i += 1;

//        }
//    }

//    public class ControlFlowExercises{
//    public static void main(String[] args) {
//        int i = 2;
//        do {
//            System.out.println();
//            i -= 5;
//        } while (i >= -10);
//    }
// }

//public class ControlFlowExercises{
//    public static void main(String[] args) {
//    for (int i = 100; i >= -10; i -= 5) {
//        System.out.println();
//        }
//    }
//}

//    public class ControlFlowExercises{
//        public static void main(String[] args) {
//            long i = 2;
//            do {
//                System.out.println(i);
//                i *= i;
//            } while(i < 1000000L);
//        }
//    }


//    public class ControlFlowExercises {
//        public static void main(String[] args) {
//            for (int i = 1; i <= 100; i += 1) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                    } else {
//                        System.out.println(i);
//                    }
//                }
//            }
//        }

import java.util.Scanner;


public class ControlFlowExercises{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        int userInt = sc.nextInt();
        System.out.println(userInt);
    }
}