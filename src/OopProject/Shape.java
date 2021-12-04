package OopProject;

/* 1.	Create an Interface 'Shape' with undefined methods as 'calculateArea' and 'calculatePerimiter'.
Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code
 */

public interface Shape {

double calculateArea();
double calculatePerimiter();
}


class Square implements Shape {

double side;

public Square(double side) {
    this.side = side;
}

@Override
public double calculateArea() {
    return side * side;
}

@Override
public double calculatePerimiter() {
    return 4 * side;
}
}

class Circle implements Shape {

double radius;

public Circle(double radius) {
    this.radius = radius;

}

@Override
public double calculateArea() {

    return Math.PI * (radius * radius);
}

@Override
public double calculatePerimiter() {

    return 2 * Math.PI * radius;
}
}
