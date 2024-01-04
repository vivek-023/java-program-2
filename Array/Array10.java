//(ip) 2,5,1,8,9 --->(op) 5,2,8,1,9
import java.util.*;
public class Array10 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];
    while(size!=0){
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("INPUT ARRAY");
        System.out.print(Arrays.toString(a));

        for(int c=1; c<a.length; c+=2){
            int b;
            b = a[c];
            a[c] = a[(c-1)];
            a[c-1] = b;
        }
        System.out.println("\nOUTPUT ARRAY");
        System.out.print(Arrays.toString(a));
        System.out.print("\nEnter size of an array:");
        size = sc.nextInt();
        a = new int[size];

    }
    sc.close();
    }
}
