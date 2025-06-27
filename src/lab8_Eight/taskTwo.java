package lab8_Eight;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class taskTwo {
    public static void main(String[] args) {
        Shape s;
        s = new Shape();
        s.draw(); // Output: Drawing shape
        s = new Circle();
        s.draw(); // Output: Drawing Circle
        s = new Rectangle();
        s.draw(); // Output: Drawing Rectangle
    }
}