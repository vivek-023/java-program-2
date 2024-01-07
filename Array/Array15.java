//Write a program to find second minimum element in an array..!
import java.util.*;
public class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int min1;
        int min2;
        int max;
    while(size!=0){
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array is:"+Arrays.toString(a));
        min1 = a[0];
        max = a[0];

        for(int l=0; l<a.length; l++){
            if(a[l] > max){
                max = a[l];
            }
        }
        
        for(int j=1; j<a.length; j++){
            if(a[j] < min1){
                min1 = a[j];
            }
        }
        min2 = max;
        for(int k=0; k<a.length; k++){
            if((min2 > min1) && (a[k] < min2) && (a[k]!=min1)){
                min2 = a[k];
            }
        }
        System.out.println("First minimum element in an array is:"+min1);
        System.out.println("Second minimum element in an array is:"+min2);

        System.out.print("Enter size of an array:");
        size = sc.nextInt();
        a = new int[size];
    }
    sc.close();
    }
}
