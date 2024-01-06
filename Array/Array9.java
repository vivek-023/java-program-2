//Write a program to find number of +ve,-ve and zero number in an array...!
import java.util.*;
public class Array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int count = 0;
        int count2 = 0;
        int count3 = 0;
    while(size!=0){
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Array is:"+Arrays.toString(a));

        for(int i=0; i<a.length; i++){
            if(a[i]<0){
                count = count+1;
            }else if(a[i]>0){
                count2 = count2+1;
            }else if(a[i]==0){
                count3 = count3+1;
            }
        }
        System.out.print("\nNegative number is in array is:"+count);
        System.out.print("\nPositive number is in array is:"+count2);
        System.out.print("\nNumber of zero in array is:"+count3);
        
        System.out.print("\nEnter size of array:");
        size = sc.nextInt();
        a = new int[size];
        count = 0;
        count2 = 0;
        count3 = 0;
    }
        sc.close();

    }
}
