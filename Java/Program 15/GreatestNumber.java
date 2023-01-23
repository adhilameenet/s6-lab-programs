import java.util.Scanner;
class A {
    void greatest() {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter two Numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        if( a > b ) {
            System.out.println(a + " is greatest.");
        } else {
            System.out.println(b + " is greatest.");
        }
    }
}
class B extends A {
    void greatest() {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three Numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if( a > b ) {
            if( a > c ){
                System.out.println(a + " is greatest.");
            } else {
                System.out.println(c + " is greatest.");
            }
        } else if ( b > c ) {
            System.out.println(b + " is greatest.");
        } else {
            System.out.println(c + " is greatest.");
        }
    }
}
class GreatestNumber {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        a.greatest();
        b.greatest();
    }
}