import java.util.*;
public class Array5 {
    //Additions of two matrices 2D array question..!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        System.out.print("Enter first matrix data:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Second matrix data:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("First Matrix");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of two matrices");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
