import java.util.*;
public class Pattern13 {
    /*pattern question
        n = 3
           *
          **
         ***              
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){
        for(int i=1; i<=n; i++){
            //System.out.print(i+"i,");
            for(int k=1; k<=n-i; k++){
                //System.out.print(k+"k,");
                System.out.print(" ");
            }
            for(int j=n; j>n-i; j--){
                //System.out.print(j);
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Enter Number:");
        n = sc.nextInt();
    }
        sc.close();
    }
}
