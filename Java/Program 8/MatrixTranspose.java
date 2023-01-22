import java.util.Scanner;
class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,cols,i,j;
        System.out.print("Enter the number of rows in the matrix :");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix :");
        cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the Matrix :");
        for (i=0; i<rows; i++) {
            for (j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int transpose[][] = new int[rows][cols];
        for (i=0; i<rows; i++) {
            for(j=0; j<cols; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Matrix before Transpose:");  
        for(i=0; i<rows; i++){    
            for(j=0; j<cols; j++) {    
                System.out.print(matrix[i][j]+" ");    
            }    
            System.out.println();
        }    
       
        System.out.println("Matrix After Transpose:");  
        for(i=0; i<rows; i++){    
            for(j=0; j<cols; j++){    
                System.out.print(transpose[i][j]+" ");    
            }    
            System.out.println(); 
        }    
    }
}