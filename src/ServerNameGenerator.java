import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
//        String[] anArray;
//
//        anArray = new String[10];
//
//        anArray[0] = "Nichole";
//        anArray[1] = "Campbell";
//        anArray[2] = "Phoebe";
//        anArray[3] = "Lono";
//        anArray[4] = "Carolyn";
//        anArray[5] = "Brittany";
//        anArray[6] = "Baker";
//        anArray[7] = "Wesley";
//        anArray[8] = "Brenda";
//        anArray[9] = "Fiona";
//
//        String[] anotherArray;
//
//        anotherArray = new String[10];
//
//        anotherArray[0] = "funny";
//        anotherArray[1] = "smart";
//        anotherArray[2] = "cute";
//        anotherArray[2] = "weird";
//        anotherArray[3] = "boring";
//        anotherArray[4] = "old";
//        anotherArray[5] = "young";
//        anotherArray[6] = "interesting";
//        anotherArray[7] = "one";
//        anotherArray[8] = "two";
//        anotherArray[9] = "three";
//
//
//        System.out.println("Element at index 0: "
//                + anArray[0]);
//        System.out.println("Element at index 1: "
//                + anotherArray[1]);
//        System.out.println("Element at index 2: "
//                + anArray[2]);
//        System.out.println("Element at index 3: "
//                + anotherArray[3]);
//        System.out.println("Element at index 4: "
//                + anArray[4]);
//        System.out.println("Element at index 5: "
//                + anotherArray[5]);
//        System.out.println("Element at index 6: "
//                + anArray[6]);
//        System.out.println("Element at index 7: "
//                + anotherArray[7]);
//        System.out.println("Element at index 8: "
//                + anArray[8]);
//        System.out.println("Element at index 9: "
//                + anotherArray[9]);

//        String random;
//        switch (random = anArray[new Random[].nextIt(anArray.length)]) {

        String[] nouns = {"one", "two"};

        String[] adjectives = {"one", "two"};

        String serverName = getRandom(adjectives) + " " + getRandom(nouns);

        System.out.println("Your server name is: " + serverName);
        }

        public static String getRandom(String[] strings) {
        int randomIndex = (int) (Math.random() * strings.length);
        return strings[randomIndex];
        }
    }
//}
