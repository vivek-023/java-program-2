import java.util.*;
public class Pattern18 {
    /*pattern question
        n = 4
         output
            *
           ***
          *****
         *******
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
      
    while(n!=0){ 
       for(int i=1; i<=n; i++){
           
            for(int l=1; l<=n-i; l++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Enter the number:");
        n = sc.nextInt();
    }
        sc.close();
    }
}
