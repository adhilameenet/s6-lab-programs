import java.util.Scanner;;
class oddOrEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.print("The Number is Even");
        } else {
            System.out.print("The Number is Odd");
        }
    }
}