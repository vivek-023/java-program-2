import java.util.*;
public class Pattern19 {
    /*pattern question
        n = 4
         output
            *******
             *****
              ***
               *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int a = 1;
        
    while(n!=0){
        for(int i=n; i>=1; i--){
          if(i!=n){
            for(int k=1; k<=a; k++){
                System.out.print(" ");
            }
            a = a + 1;
          }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.print("Enter the Number:");
        n = sc.nextInt();
        a = 1;
    }
        sc.close();
    }
}
