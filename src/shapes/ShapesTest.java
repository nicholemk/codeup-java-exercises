package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle (5, 10);
        System.out.println("This rectangle's perimeter is " + myShape.getPerimeter());
        System.out.println("This rectangle's area is " + myShape.getArea());

        Rectangle tableTop = new Rectangle(8, 3);
        System.out.println("This rectangle's perimeter is " + tableTop.getPerimeter());
        System.out.println("This rectangle's area is " + tableTop.getArea());

        Square window = new Square(5);
        System.out.println("This square's perimeter is " + window.getPerimeter());
        System.out.println("This square's area is " + window.getArea());

    }
}
