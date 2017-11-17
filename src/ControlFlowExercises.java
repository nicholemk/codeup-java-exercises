import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your starting numbeR?");
        int start = scan.nextInt();

        System.out.println("What is your ending number?");
        int end = scan.nextInt();

//        System.out.println("What do you want to increase by each time?");
//        int incrementer = scan.nextInt();

        int incrementer;

        do{
            System.out.println("Enter an integer greater than 0 to count by");
            incrementer = scan.nextInt();
        } while(incrementer <= 0);

//        if incrementer == 0) {
//            System.out.println("Please enter an incrementer greater than 0");
//            incrementer = scan.nextInt();
//        } else {

        if(start < end) {
            for(int i = start; i <= end; i += incrementer) {
                System.out.println(i);
            }

        } else {
            for(int i = end; i > start; i -= incrementer) {
                System.out.println(i);
            }
        }
    }
}
