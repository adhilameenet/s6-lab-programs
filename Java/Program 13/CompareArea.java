class Test {
	int a,b;
	Test(int i,int j) {
		a = i;
		b = j;
	}
	int area() {
	    int ar = a * b;
	    return ar;
	}
	void compare(Test o) {
		if(o.area() == this.area()) {
            System.out.println("Area of both Rectangles are Equal");
        }
		if(o.area() > this.area()) {
            System.out.println("Second Rectangle has more Area");
        }
		if(o.area() < this.area()) {
            System.out.println("First Rectangle has more Area");
        }
	}
}
			
class CompareArea {
	public static void main(String args[]) {
		Test a1 = new Test(30,20);
		Test a2 = new Test(10,20);
		a1.compare(a2);
	}
}

		