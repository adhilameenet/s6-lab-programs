import java.util.Scanner;
class fibonacciLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c = 0, limit;
        System.out.print("Enter the Limit :");
        limit = sc.nextInt();
        System.out.println("Fibonacci Series :");
        while(c <= limit) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }    
}
