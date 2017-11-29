import java.util.Random;

public class ArrayExercises {
    public static void main(String[] args) {
        System.out.println("Generating random integers...");

        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 10; ++idx) {
            int randomInt = randomGenerator.nextInt(100);
            System.out.println("Generated: " + randomInt);
        }
            System.out.println("done with randoms");

//        System.out.println("now printing odds:");
//
//        Random oddGenerator = new Random();
//        for(int idx % 1; idx <= 10; ++idx) {
//
//        }


    }


}

