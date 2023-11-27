import java.util.*;
public class Pattern14 {
    /*pattern question
        n = 4
        ****
         ***
          **
           *
    */
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){
        for(int i=n; i>=1; i--){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Enter NUmber:");
        n = sc.nextInt();
    }
        sc.close();
    }    
}
