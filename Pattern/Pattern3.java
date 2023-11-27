import java.util.*;
public class Pattern3 {
    /*pattern question
       n = 3
       1
       2 2
       3 3 3
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.print("Enter Number:");
        n = sc.nextInt();
    }
        sc.close();
    }
}
