public class MethodsExercises {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);
        result = result - 1;
        System.out.println(result);
        result = result * 2;
        System.out.println(result);
        result = result/2;
        System.out.println(result);

        public static int getInteger(int min, int max);
//        System.out.println(getInteger);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println(userInput);
    }
}
