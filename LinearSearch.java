import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int a[] = new int[size];
        while(size!=0){
        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter n:");
        int x = sc.nextInt();
        for(int i=0; i<size; i++){
            if(a[i]==x){
                System.out.print(x+" Found at location = "+i);
            }
        }
        //System.out.print(x+" Not found..!");
        System.out.print("Enter size of an array:");
        size = sc.nextInt();
    }
        sc.close();
    }
    
}
