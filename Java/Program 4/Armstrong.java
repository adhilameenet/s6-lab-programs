import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,temp, remainder, result = 0;
        System.out.print("Enter a Number :");
        number = sc.nextInt();
        temp = number;
        while (number != 0)
        {
            remainder = number % 10;
            result += Math.pow(remainder, 3);
            number /= 10;
        }
        if(result == temp)
            System.out.println(temp + " is an Armstrong number.");
        else
            System.out.println(temp + " is not an Armstrong number.");
    }
}