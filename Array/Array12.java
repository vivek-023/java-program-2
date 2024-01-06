//Write a program to find maximum number in an array...!
import java.util.*;
public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];

        while(size!=0){
            for(int i=0; i<a.length; i++){
                a[i] = sc.nextInt();
            }
            System.out.print("Array is:"+Arrays.toString(a));

            for(int i=0; i<a.length; i++){
                for(int j=0; j<a.length; j++){
                    if(a[i]>a[j]){
                    }
                }
            }
        }
        sc.close();
    }
}
