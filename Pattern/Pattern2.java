import java.util.*;
public class Pattern2 {
    /*pattern question
        n = 4
        1
        1 2
        1 2 3
        1 2 3 4
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.print("Enter Number:");
        n = sc.nextInt();
    }
        sc.close();
        
    }
}
