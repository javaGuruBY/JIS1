import bean.Circle;
import bean.Square;
import bean.Triangle;
import interfaces.Shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5);
        shape[1] = new Square(5);
        shape[2] = new Triangle(3, 6);

        for (Shape object : shape) {
            System.out.println(object.getName() + " area = " + object.getArea());
        }

    }
}
