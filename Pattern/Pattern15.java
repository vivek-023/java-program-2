import java.util.*;
public class Pattern15 {
    /* pattern question
        n = 4
        * * * *
        *     *
        *     *
        * * * *
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=1; j--){
                if(i==1){
                System.out.print("* ");
                }else if((i!=n && i!=1)){
                    if(j==n || j==1){
                    System.out.print("* ");
                    }else if(j!=n || j!=1){
                        System.out.print("  ");
                    }
                }else if(i==n){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.print("Enter Number:");
        n = sc.nextInt();
    }
    sc.close();
    }
}
