//Write a program to reverse elements of an array..!
import java.util.*;
public class Array8 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter size of an array:");
            int size = s.nextInt();
            int[] a = new int[size];
        while(size!=0){
            for(int i=0; i<a.length; i++){
                a[i] = s.nextInt();
            }
            System.out.println("----HERE IS AN ARRAY----");
            for(int i=0; i<a.length; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            System.out.println("----HERE IS AN ARRAY WITH REVERSE ELEMENT----");
            for(int i=a.length-1; i>=0; i--){
                System.out.print(a[i]+" ");
            }
             System.out.print("\nEnter size of an array:");
             size = s.nextInt();
             a = new int[size];
        }
        }
}