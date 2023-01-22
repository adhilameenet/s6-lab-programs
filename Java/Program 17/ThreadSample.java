class Hi {
    public void show() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }
}

class Hello {
    public void show() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

class ThreadSample {
    public static void main(String []args) {
        Hi ob1 = new Hi();
        Hello ob2 = new Hello();
        ob1.show();;
        ob2.show();
    }
}