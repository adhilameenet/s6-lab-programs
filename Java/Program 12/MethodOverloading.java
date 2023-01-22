class TriangleArea {
	void area(double a) {
		double a1 = (Math.sqrt(3)/4)*(a*a);
		System.out.println("Area of the Equilateral Triangle :"+ a1);
	}
	void area(double b,double h) {
		double a2 = 0.5 * b * h;
		System.out.println("Area of the Isosceles Triangle :"+ a2);
	}
	void area(double a,double b,double c) {
		double s = (a+b+c) / 2;
		double a3 = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the Scalene Triangle :"+ a3);
	}
}
class MethodOverloading {
	public static void main(String args[]) {
		TriangleArea t = new TriangleArea();
		t.area(10);
		t.area(10,20);
		t.area(10,6,5);
	}
}