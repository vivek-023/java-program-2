//Write a program to calculate sum of even and odd elements in an array in one loop..!
import java.util.*;
public class Array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int evenSum = 0;
        int oddSum = 0;
        while(size!=0){
            for(int i=0; i<a.length; i++){
                a[i] = sc.nextInt();
            }
            System.out.print("Array is:"+Arrays.toString(a));

            for(int i=0; i<a.length; i++){
                if(a[i]%2==0){
                    evenSum = evenSum + a[i];
                }else{
                    oddSum = oddSum + a[i];
                }
            }
            System.out.print("\nEven sum of even elements is:"+evenSum);
            System.out.print("\nOdd sum of odd elements is:"+oddSum);

            System.out.print("\nEnter size of an array:");
            size = sc.nextInt();
            a = new int[size];
            evenSum = 0;
            oddSum = 0;
        }
        sc.close();
    }
}
