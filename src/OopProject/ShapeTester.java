package OopProject;


public class ShapeTester {

    public static void main(String[] args) {

        Square s = new Square(5);

        System.out.println("Area of the square is: " + s.calculateArea());
        System.out.println("Perimeter of the square is: " + s.calculatePerimiter());


        Circle c = new Circle(3);

        System.out.println("Area of the circle is: " + c.calculateArea());
        System.out.println("Perimeter of the circle is: " + c.calculatePerimiter());

    }
}