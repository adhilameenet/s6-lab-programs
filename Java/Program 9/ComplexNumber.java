import java.util.Scanner;
class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real1,imaginary1,real2,imaginary2,realSum,imaginarySum;
        System.out.print("Enter the real part of the first complex number :");
        real1 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number :");
        imaginary1 = sc.nextDouble();
        System.out.print("Enter the real part of the second complex number :");
        real2 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number :");
        imaginary2 = sc.nextDouble();
        realSum = real1 + real2;
        imaginarySum = imaginary1 + imaginary2;
        System.out.println(real1 + " + " + imaginary1 + "i" + " + " + real2 + " + " + imaginary2 + "i" + " = " + realSum + " + " + imaginarySum + "i");
    }
}