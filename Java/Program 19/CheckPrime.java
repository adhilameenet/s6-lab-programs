import first.*;
import java.util.Scanner;

public class CheckPrime {
    public void check(int x) {
        Prime p = new Prime();
        if (p.isPrime(x) == 1)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        CheckPrime cp = new CheckPrime();
        System.out.print("Enter a Number :");
        num = sc.nextInt();
        cp.check(num);
    }
}