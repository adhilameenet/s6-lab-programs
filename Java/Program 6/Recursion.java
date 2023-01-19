import java.util.Scanner;
class Factorial {
    int fact(int n) {
        int result;
        if ( n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }
}
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number :");
        num = sc.nextInt();
        Factorial f = new Factorial();
        System.out.println("Factorial is : " + f.fact(num));
    }
}