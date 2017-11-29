package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        System.out.println("Let's make a rectangle");

        Rectangle tableTop = new Rectangle(4, 2);
        System.out.println("This rectangle's perimeter is " + tableTop.perimeter());
        System.out.println("This rectangle's area is " + tableTop.area());

        Square window = new Square(5);
        System.out.println("This square's perimeter is " + window.perimeter());
        System.out.println("This square's area is " + window.area());

    }
}
