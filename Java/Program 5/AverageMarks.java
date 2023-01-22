import java.util.Scanner;
class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3,average,n;
        System.out.print("Enter your First Mark :");
        m1 = sc.nextInt();
        System.out.print("Enter your Second Mark :");
        m2 = sc.nextInt();
        System.out.print("Enter your Third Mark :");
        m3 = sc.nextInt();
        average = (m1 + m2 + m3) / 3;
        System.out.println("Average : " + average + "\n");
        n = average / 10;
        switch(n) {
            case 9 :
                    System.out.println("You got A Grade!");
                    break;
            case 8 :
                    System.out.println("You got B Grade!");
                    break;
            case 7 :
                    System.out.println("You got C Grade!");
                    break;
            case 6 :
                    System.out.println("You got D Grade!");
                    break;
            case 5 :
                    System.out.println("You got E Grade!");
                    break;
            default :
                    System.out.println("Failed!");
        }   
    }
}
