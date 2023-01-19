import java.util.Scanner;
class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,temp;
        int arr[] = new int[20];
        System.out.print("Enter the Number of Elements :");
        n = sc.nextInt();
        System.out.print("Enter the Array Elements :");
        for(i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(i = 0; i < n ; i++) {
            for(j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The Sorted Array Elements Are :");
        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

