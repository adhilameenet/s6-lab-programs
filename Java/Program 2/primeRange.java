import java.util.Scanner;
class primeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower,upper,i,j,flag = 0;
        System.out.print("Enter the Lower Limit :");
        lower = sc.nextInt();
        System.out.print("Enter the Upper Limit :");
        upper = sc.nextInt();
        System.out.println("The Numbers are :");
        for(i = lower; i <= upper; i++) {
            for (j = 2; j < i ; j++) {
                if(i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if(flag == 1) {
                System.out.println(i);
            }
        }
    }
}