interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Sphere implements Shape {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

public class SphereCircleArea {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.getArea());
        Sphere sphere = new Sphere(5);
        System.out.println("Area of Sphere: " + sphere.getArea());
    }
}
