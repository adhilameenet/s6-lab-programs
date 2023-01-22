import java.util.Scanner;

class ExceptionDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k;
        System.out.print("Enter the Number :");
        k = sc.nextInt();
        try{
            if(k < 10) {
                throw new ArithmeticException();
            } else {
                System.out.println(k); 
            }
        }   
        catch(ArithmeticException e) {
            System.out.println("Minimum value for the input is 10");
        }
    }
}