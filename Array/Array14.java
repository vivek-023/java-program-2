//Write a java program to find minimum element in an array...!
import java.util.*;
public class Array14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int min;
while(size!=0){
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array is:"+Arrays.toString(a));
        min = a[0];

        for(int j=1; j<a.length; j++){
            if(a[j] < min){
                min = a[j];
            }
        }

        System.out.println("Minimum element in an array is:"+min);
        System.out.print("Enter size of an array:");
        size = sc.nextInt();
        a = new int[size];

    } 
    sc.close();  
    }
}
