//Write a program to find second maximum element in an array...!
import java.util.*;
public class Array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int max1;
        int max2;
    while(size!=0){
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array is:"+Arrays.toString(a));
        max1 = a[0];
        max2 = a[0];
        
        for(int j=1; j<a.length; j++){
            if(a[j] > max1){
                max1 = a[j];
            }
            
        }
        for(int k=0; k<a.length; k++){
            if((max2 < max1) && (a[k] > max2) && (a[k] != max1)){
                max2 = a[k];
            }
        }
        
        System.out.println("First maximum element in an array is:"+max1);
        System.out.println("Second maximum element in an array is:"+max2);

        System.out.print("Enter size of an array:");
        size = sc.nextInt();
        a = new int[size];
    }   
    sc.close(); 
    }
}
