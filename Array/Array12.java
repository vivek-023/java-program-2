//Write a program to find maximum number in an array...!
import java.util.*;
public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int max;

        while(size!=0){
            for(int i=0; i<a.length; i++){
                a[i] = sc.nextInt();
            }
            System.out.println("Array is:"+Arrays.toString(a));
            max = a[0];

            for(int i=1; i<a.length; i++){
                if(a[i] > max){
                    max = a[i];
                }
            }
            System.out.println("Maximum element in an array is:"+max);
            System.out.print("Enter size of an array:");
            size = sc.nextInt();
            a = new int[size];

        }
        sc.close();
    }
}
