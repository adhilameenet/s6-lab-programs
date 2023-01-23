import java.util.Scanner;
interface shape {
    void area();
}
class circle implements shape{
public void area(){
    double area;
    int radius;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Radius of the Circle : ");
    radius = sc.nextInt();
    area = 3.14 * radius * radius;
    System.out.println("Area of the Circle : " + area);

}
}
class sphere implements shape{
    public void area() {
        double area;
        int radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the Sphere : ");
        radius = sc.nextInt();
        area = 4 * 3.14 * radius * radius;
        System.out.println("Area of the Sphere : "+ area);
    }
}
class SphereCircleArea {
    public static void main(String args[]) {
        circle c = new circle();
        sphere s = new sphere();
        c.area();
        s.area();
    }
}
