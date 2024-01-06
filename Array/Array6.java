//Write a program to reverse elements of an array..!
//(ip) [1,2,3,4,5,6] ----> (op) [6,5,4,3,2,1]
import java.util.*;
public class Array6 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter size of an array:");
            int size = s.nextInt();
            int[] a = new int[size];
        while(size!=0){
            for(int i=0; i<a.length; i++){
                a[i] = s.nextInt();
            }
            System.out.println("<----HERE IS AN ARRAY---->");
            System.out.print(Arrays.toString(a));
            System.out.println("\n<----HERE IS A REVERSE ARRAY---->");
            for(int i=0; i<a.length/2; i++){
                int c;
                c = a[i];
                a[i] = a[a.length-(i+1)];
                a[a.length-(i+1)] = c;
            }
            System.out.print(Arrays.toString(a));
             System.out.print("\nEnter size of an array:");
             size = s.nextInt();
             a = new int[size];
        }
        s.close();
        }
}