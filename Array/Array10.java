//Write a program to calculate the sum of all elements of an array
import java.util.*;
public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int sum = 0;

        while(size!=0){
            for(int i=0; i<a.length; i++){
                a[i] = sc.nextInt();
            }
            System.out.print("Array is:"+Arrays.toString(a));

            for(int i=0; i<a.length; i++){
                sum = sum + a[i];
            }
            System.out.print("\nSum of all elements of an array is:"+sum);

            System.out.print("\nEnter size of an array:");
            size = sc.nextInt();
            a = new int[size];
            sum = 0;
        }
        sc.close();
    }
}
